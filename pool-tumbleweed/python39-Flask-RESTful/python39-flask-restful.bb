SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.9"

RPM_NAME = "python39-Flask-RESTful-0.3.9-1.10.noarch.rpm"
RPM_HASH = "ecbced2f021a28742861a9898bb4c4d9209fc249dfda764ec7504c15f791dbd8d4ac1ac38d441ea1aa0e551d2bd0d7d5c2aa20d080344ba82a8819439ab4f44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-restful \
python39-Flask-RESTful \
python3dist-flask-restful"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-aniso8601 \
python39-pytz \
python39-six"

inherit rpm
