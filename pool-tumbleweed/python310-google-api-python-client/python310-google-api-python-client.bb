SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.89.0"

RPM_NAME = "python310-google-api-python-client-2.89.0-2.1.noarch.rpm"
RPM_HASH = "4ef46d01e3a4edc7031b1fe135bce203008dcd7436de858fc7c75af5acbef66194f06802b9a71d58375092466d0de1c43b268f434922abfa65e088f3ec4e2701"
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
