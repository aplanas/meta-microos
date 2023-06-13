SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "python39-pydrive2-1.10.1-1.5.noarch.rpm"
RPM_HASH = "4f770afd4abdba3d0790ea1c72adc3b1f56b9e6288889e94053e6b1cb74cc8eb484d9f2e7f0a70657d814ef2e4e800e43bb2f27f7b9882fb462fe6f700520a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydrive2) \
python39-pydrive2 \
python3dist(pydrive2)"

RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-filelock \
python39-google-api-python-client \
python39-google-auth \
python39-google-auth-httplib2 \
python39-google-auth-oauthlib \
python39-pyOpenSSL \
python39-six"

inherit rpm
