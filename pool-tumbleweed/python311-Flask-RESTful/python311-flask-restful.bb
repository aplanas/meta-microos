SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.10"

RPM_NAME = "python311-Flask-RESTful-0.3.10-1.1.noarch.rpm"
RPM_HASH = "e60ed4ba8a5b5847ae5211edb136f6806a3c2710d23e44e706b3aedcf7c73802c2d32f533e53b932a9081496545c5b650a9e994199f83c2cbb6821d707eb6c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-RESTful \
python3.11dist-flask-restful \
python311-Flask-RESTful \
python3dist-flask-restful"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-aniso8601 \
python311-pytz \
python311-six"

inherit rpm
