SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.86.0"

RPM_NAME = "python39-google-api-python-client-2.86.0-1.1.noarch.rpm"
RPM_HASH = "659c317391d8c38425c263e05751d995afbff534a329f0ec98354f93d080095ae13cb915b11330e4b181a6278bd3ef28461b6aeaecaa6e3677b72fbb26a86e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client \
python3.9dist(google-api-python-client) \
python39-google-api-python-client \
python3dist(google-api-python-client)"

RDEPENDS:${PN} += "python(abi) \
python39-google-api-core \
python39-google-auth \
python39-google-auth-httplib2 \
python39-httplib2 \
python39-uritemplate"

inherit rpm
