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

RPM_NAME = "python311-astral-3.2-1.3.noarch.rpm"
RPM_HASH = "453d50299e9d1c1aee9662bef947a0708880bbcd2e4211116d5f112568da1a5cdb8445fce51c663b8ae1f9f69dd880846a506aedc5cfc3578f8abd608c43c6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astral \
python3.11dist-astral \
python311-astral \
python3dist-astral"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-requests"

inherit rpm
