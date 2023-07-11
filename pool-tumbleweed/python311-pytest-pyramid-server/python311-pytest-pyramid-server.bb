SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-pyramid-server-1.7.0-2.6.noarch.rpm"
RPM_HASH = "44fec6a332ff445cfcbb3132ac7bfe431fa5ea516bf510e255b35405da1f0080313fe5b990f4652799f4b0be8bc0834bda03e509ec93c03c242d3fdca243dd75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pyramid-server \
python3.11dist-pytest-pyramid-server \
python311-pytest-pyramid-server \
python3dist-pytest-pyramid-server"

RDEPENDS:${PN} += "python-abi \
python311-pyramid \
python311-pytest-server-fixtures \
python311-six \
python311-waitress"

inherit rpm
