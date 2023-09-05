SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.97.0"

RPM_NAME = "python39-google-api-python-client-2.97.0-1.1.noarch.rpm"
RPM_HASH = "f8b83190d9f19ef8072fb8cd4606f6cab06930e643f7ed367693c78617adeaf9a20c5f2222b5fcf2baa04f893e53080ada6b1a3807b436dd1c0962a513fccfbc"
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
