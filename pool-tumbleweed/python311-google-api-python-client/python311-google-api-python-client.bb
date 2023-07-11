SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.89.0"

RPM_NAME = "python311-google-api-python-client-2.89.0-2.1.noarch.rpm"
RPM_HASH = "f0052b022a87ae3c9b44eaa11363b446fa5b36dbdb32587312a3e6bdb53ae919bf43d22187e4e8d4a0a58b1bc46d67307b90be74dfa0f7b7e75221c2b9f976e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client \
python3-google-api-python-client \
python3.11dist-google-api-python-client \
python311-google-api-python-client \
python3dist-google-api-python-client"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-google-auth \
python311-google-auth-httplib2 \
python311-httplib2 \
python311-uritemplate"

inherit rpm
