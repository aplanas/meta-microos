SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.93.0"

RPM_NAME = "python310-google-api-python-client-2.93.0-1.1.noarch.rpm"
RPM_HASH = "cc7946cefbdeb92fa5d96ca9f03250f44f141152bc7fed6b1b5f97e80524077765314d092551572ece7eb1b22a3d7acf5570b27109d09d28d56cf1a042f4ff62"
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
