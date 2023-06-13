SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-pyramid-server-1.7.0-2.4.noarch.rpm"
RPM_HASH = "4ed9b3ae8c363dee709cdf225ed28177cfc9f5df1ffbdb0101454764fcff830312cf3f0e5605ad7d4fe2b5fb92de269f8e5df59db28e100b88279f2d3b1330ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-pyramid-server) \
python311-pytest-pyramid-server \
python3dist(pytest-pyramid-server)"

RDEPENDS:${PN} += "python(abi) \
python311-pyramid \
python311-pytest-server-fixtures \
python311-six \
python311-waitress"

inherit rpm
