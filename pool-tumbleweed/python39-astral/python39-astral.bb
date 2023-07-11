SUMMARY = "Calculations for the position of the sun and moon"
DESCRIPTION = "This is 'astral' a Python module which calculates \
 \
* Times for various positions of the sun: dawn, sunrise, solar noon, \
  sunset, dusk, solar elevation, solar azimuth and rahukaalam. \
* The phase of the moon. \
 \
For documentation see the http://astral.readthedocs.io/en/latest/index.html"
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "python39-astral-3.2-1.3.noarch.rpm"
RPM_HASH = "8f1c206e9f151d01538321498968d9c36db9db6c747ef8d82a0248148edb5210d01dfeba0a801de842444597b46c08b5893427ce89030c0d848491d4223a950a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-astral \
python39-astral \
python3dist-astral"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-requests"

inherit rpm
