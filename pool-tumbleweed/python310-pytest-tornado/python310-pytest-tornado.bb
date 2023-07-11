SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python310-pytest-tornado-0.8.1-1.14.noarch.rpm"
RPM_HASH = "f004105f217852e5dbc627cc7e492d4add517aba2bae0b65abc3a8d6a593800b1450f3570d50f98e7b1bbb1bf3dde7780201e075b5e742d325b24afee15ed519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-tornado \
python310-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python310-certifi \
python310-pytest \
python310-tornado"

inherit rpm
