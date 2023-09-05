SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.97.0"

RPM_NAME = "python311-google-api-python-client-2.97.0-1.1.noarch.rpm"
RPM_HASH = "9d500f42e74dad34b654235b8ada5fdb7a703a198b2790952949d6aa8f7f70218993b15045e5edc97499e224f9e9ec2f3c4f024c6a1f661342a772522dc0828c"
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
