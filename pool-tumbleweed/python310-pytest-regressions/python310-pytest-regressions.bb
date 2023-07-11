SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "python310-pytest-regressions-2.4.2-3.3.noarch.rpm"
RPM_HASH = "e2789fe866d01ab9b47ed1e401eab93a5d87c72ff343f1b7b6d3d6e2a0d6a227e1170b7dbc0ac1283caff5cb98231122b5373b94538a5cc835a5bddb1b24dd85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-regressions \
python310-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-pytest \
python310-pytest-datadir"

inherit rpm
