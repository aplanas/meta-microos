SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "python310-pydrive2-1.10.1-1.5.noarch.rpm"
RPM_HASH = "441f1ee0403efd313fda41257ead89897a5ac8118c51221f2cb9a78f792a694a2fbe2062d3ea00b3bd594cebeb43ca64045d0204d11d3f159e8fbd7477b89e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydrive2 \
python3.10dist(pydrive2) \
python310-pydrive2 \
python3dist(pydrive2)"

RDEPENDS:${PN} += "python(abi) \
python310-PyYAML \
python310-filelock \
python310-google-api-python-client \
python310-google-auth \
python310-google-auth-httplib2 \
python310-google-auth-oauthlib \
python310-pyOpenSSL \
python310-six"

inherit rpm
