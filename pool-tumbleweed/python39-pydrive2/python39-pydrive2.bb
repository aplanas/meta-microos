SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "python39-pydrive2-1.10.1-1.7.noarch.rpm"
RPM_HASH = "ac98dc7bcca5c6cc755e5a159a8d7cda8e438825c52c2427d5fc70edb6de1ed27ed260ffd7fc6a311688216652bbed9f19bb790ae096e74a00882f4256bcc3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydrive2 \
python39-pydrive2 \
python3dist-pydrive2"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-filelock \
python39-google-api-python-client \
python39-google-auth \
python39-google-auth-httplib2 \
python39-google-auth-oauthlib \
python39-pyOpenSSL \
python39-six"

inherit rpm
