SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "python311-pydrive2-1.10.1-1.5.noarch.rpm"
RPM_HASH = "074d1558d567043c00568dc915e4f6c807509ae51a625539af8fe2b42e9cccaa0b9dc50d9acf73a6807f27aa625d651655c13630b9c988fb7c73d55f8383c7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydrive2) \
python311-pydrive2 \
python3dist(pydrive2)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-filelock \
python311-google-api-python-client \
python311-google-auth \
python311-google-auth-httplib2 \
python311-google-auth-oauthlib \
python311-pyOpenSSL \
python311-six"

inherit rpm
