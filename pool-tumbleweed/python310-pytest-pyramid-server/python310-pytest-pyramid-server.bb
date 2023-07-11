SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-pyramid-server-1.7.0-2.6.noarch.rpm"
RPM_HASH = "6e1c3f0a11a4a15c9caa4f05316c80cb97772dc62ddec241c84881ea5bf6da09c7c764d7a0c6e02de03b42934ceb7c56a0b2b5acabcad0b0bf9c4df6b08704d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-pyramid-server \
python310-pytest-pyramid-server \
python3dist-pytest-pyramid-server"

RDEPENDS:${PN} += "python-abi \
python310-pyramid \
python310-pytest-server-fixtures \
python310-six \
python310-waitress"

inherit rpm
