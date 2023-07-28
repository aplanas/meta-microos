SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.93.0"

RPM_NAME = "python39-google-api-python-client-2.93.0-1.1.noarch.rpm"
RPM_HASH = "f801fa44956e8e89d56dff361377cb6d3ca846cd013d9eca4fd164ea537138c65ce024ec623d56d4520fbd4460cfefc82dbbff014d3ccca2c9f01c79d2d1f99c"
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
