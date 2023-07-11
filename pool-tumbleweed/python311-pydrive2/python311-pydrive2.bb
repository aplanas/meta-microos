SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "python311-pydrive2-1.10.1-1.7.noarch.rpm"
RPM_HASH = "a067c50bbd48052b7dd1e27ab3e63f7059d4619596a32bd2962ab57ae434494f6a74ca5205e5c4fd0ba1b1397ce4d13767c2b2e29613761aca82cb8850f7b29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydrive2 \
python3.11dist-pydrive2 \
python311-pydrive2 \
python3dist-pydrive2"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-filelock \
python311-google-api-python-client \
python311-google-auth \
python311-google-auth-httplib2 \
python311-google-auth-oauthlib \
python311-pyOpenSSL \
python311-six"

inherit rpm
