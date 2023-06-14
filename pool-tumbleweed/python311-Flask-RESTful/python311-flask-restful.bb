SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.9"

RPM_NAME = "python311-Flask-RESTful-0.3.9-1.10.noarch.rpm"
RPM_HASH = "5072e3cd02c7f8ec64e667b30a9613e186ef0a39bd3121eabca34b7704d6090e01d4f3187cd8e69b94eb25492cf69e42f6ffa417cedadad9d14ec80b484cb64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-restful \
python311-Flask-RESTful \
python3dist-flask-restful"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-aniso8601 \
python311-pytz \
python311-six"

inherit rpm
