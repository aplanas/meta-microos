SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.89.0"

RPM_NAME = "python39-google-api-python-client-2.89.0-2.1.noarch.rpm"
RPM_HASH = "8fc3dbdc5c9daa24fd23a27441fd5630418c8e5e0c70ae4a014179a2e33c4c51af518aa2970eed094b946185bbbe0de2cad628907b07416d47389ff150888e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client \
python3.9dist-google-api-python-client \
python39-google-api-python-client \
python3dist-google-api-python-client"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-google-auth \
python39-google-auth-httplib2 \
python39-httplib2 \
python39-uritemplate"

inherit rpm
