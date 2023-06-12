SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.9"

RPM_NAME = "python310-Flask-RESTful-0.3.9-1.10.noarch.rpm"
RPM_HASH = "e5de69826a5877f90f05f2c3f38c9af65d9597f552afe23c65d5e226e0cb369c272f411ed6cfe5692a019b8bbc60d54150a0da8f06951d9cb255118f54f7657d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-RESTful \
python3.10dist(flask-restful) \
python310-Flask-RESTful \
python3dist(flask-restful)"
RDEPENDS:${PN} += "python(abi) \
python310-Flask \
python310-aniso8601 \
python310-pytz \
python310-six"

inherit rpm
