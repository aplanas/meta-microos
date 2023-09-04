SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-test-2.0.3-1.2.noarch.rpm"
RPM_HASH = "4d040e83970a0df4e63c6e47d31ffec663fae04096664173d557c1e55594f398f934d30fb3709b7b239b1897c54325d57959fb78be68e538a26ee795ec444258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-test"

RDEPENDS:${PN} += "python310-hypothesis \
python310-pandas \
python310-pytest \
python310-pytest-asyncio \
python310-pytest-xdist"

inherit rpm
