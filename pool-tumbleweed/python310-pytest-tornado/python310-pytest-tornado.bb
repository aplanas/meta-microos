SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python310-pytest-tornado-0.8.1-1.12.noarch.rpm"
RPM_HASH = "4776fc39e21537e3c9b0bb6fbadf8523a93eaedefa926f4dafe929c5e8d30884950357ee47131f1444920fbc9fda7f8c0d9427784403d38b30ab5fc84d1e1e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tornado \
python3.10dist(pytest-tornado) \
python310-pytest-tornado \
python3dist(pytest-tornado)"

RDEPENDS:${PN} += "python(abi) \
python310-certifi \
python310-pytest \
python310-tornado"

inherit rpm
