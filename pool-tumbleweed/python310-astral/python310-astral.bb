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

RPM_NAME = "python310-astral-3.2-1.3.noarch.rpm"
RPM_HASH = "6d13c8cfa9ee5bdbfe150ca242d0091e5747a979df7c4d876a8e7b4ff63b43366923af2fdf9ba55f1c1c8217df75c7be99c34fc185a87b4c97a4657ace7ea017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-astral \
python310-astral \
python3dist-astral"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-requests"

inherit rpm
