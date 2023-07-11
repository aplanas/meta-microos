SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "python310-pydrive2-1.10.1-1.7.noarch.rpm"
RPM_HASH = "1a0ca9ebbf6599ee960b39b681d9795e6e14f3346ec684db9a5ba574545202388ae031790a822570c17f7b4f26a39408730d35fcb63322de2a540438381c82c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydrive2 \
python310-pydrive2 \
python3dist-pydrive2"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-filelock \
python310-google-api-python-client \
python310-google-auth \
python310-google-auth-httplib2 \
python310-google-auth-oauthlib \
python310-pyOpenSSL \
python310-six"

inherit rpm
