SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-pyramid-server-1.7.0-2.4.noarch.rpm"
RPM_HASH = "d59ecba2f3e7a474bc0c64771e79cd899a77958d94329aee392f87516e452e4a4f60a6053a762ad68a7074eae115f472ea040798b7ccbe627d575b1a4291891f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pyramid-server \
python3.10dist(pytest-pyramid-server) \
python310-pytest-pyramid-server \
python3dist(pytest-pyramid-server)"

RDEPENDS:${PN} += "python(abi) \
python310-pyramid \
python310-pytest-server-fixtures \
python310-six \
python310-waitress"

inherit rpm
