SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.93.0"

RPM_NAME = "python311-google-api-python-client-2.93.0-1.1.noarch.rpm"
RPM_HASH = "e06e0f37f6476e07baea87258a87f8429ee85c9d7bd5324fe37d26a3136e1028a6b62da907a45c229e64a305294a5bcf76f3a9e3e501b6a54fabe9a3356a2210"
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
