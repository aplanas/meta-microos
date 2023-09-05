SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.97.0"

RPM_NAME = "python310-google-api-python-client-2.97.0-1.1.noarch.rpm"
RPM_HASH = "5f43c711d960e8584424a748250bca0e3d1a918e0d7a784a12b35ce4ef258dcc5e4c3fa0da71216fe421653529b5314e3d0c5c8eaa956743d1a43325910de621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client \
python3.10dist-google-api-python-client \
python310-google-api-python-client \
python3dist-google-api-python-client"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-google-auth \
python310-google-auth-httplib2 \
python310-httplib2 \
python310-uritemplate"

inherit rpm
