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

RPM_NAME = "python39-astral-3.2-1.1.noarch.rpm"
RPM_HASH = "671fd9b1b55876ae9114d26e155ad75a61452037ccd294d52afbb2bc6a05b67f01b9eef5da0e582c5e59ab4d6157234eba1966506eced8773b056fbb7c23eb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-astral \
python39-astral \
python3dist-astral"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-requests"

inherit rpm
