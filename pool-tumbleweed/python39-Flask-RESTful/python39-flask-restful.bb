SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.10"

RPM_NAME = "python39-Flask-RESTful-0.3.10-1.1.noarch.rpm"
RPM_HASH = "742f26afd3d91396d181520c76629385de6cf58298d2ac9bf4a101499693b09b4d0f7e05873b93eadd3cb12a1b7d21e3235cd01ea80215f345a4bb2fc8d0b929"
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
