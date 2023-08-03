SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-pytest-check-2.2.0-1.1.noarch.rpm"
RPM_HASH = "cba12ec6aebe86a01ee55060059add212d93410869239f9eebe9eb2ab22b01f3211c6b7274ff070ae02b224a1bc7cca68b804d94203d2c584723f7ddefcccfdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-check \
python310-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
