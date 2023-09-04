SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python310-pytest-tornado-0.8.1-2.1.noarch.rpm"
RPM_HASH = "636eefc62f02d5f19778820c289b708c691fafdfa2f3c4602dacdeef38f19bc944420ba79e01f7701ae862001066259d9449ddec34ed1d01078c377af050fa86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-tornado \
python310-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python310-certifi \
python310-pytest \
python310-tornado"

inherit rpm
