SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.10"

RPM_NAME = "python310-Flask-RESTful-0.3.10-1.1.noarch.rpm"
RPM_HASH = "1b45a615ff3569c5bb181bbf93893bba97e4e92f201247127c0feefa62bac19a98898a091a0cb679ca54f549aefd09ef264769c80e1e4f1df777663b144ede9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-restful \
python310-Flask-RESTful \
python3dist-flask-restful"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-aniso8601 \
python310-pytz \
python310-six"

inherit rpm
