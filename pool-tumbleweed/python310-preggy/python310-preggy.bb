SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python310-preggy-1.4.4-2.12.noarch.rpm"
RPM_HASH = "5fd0044fcb94beccda2695182d0bb94dfafc946128ca3cef6a908ac2fda6a017c021f6c5523425d840869ce259e3df7134bf37950bde63360383bdfc506cbb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-preggy \
python3.10dist-preggy \
python310-preggy \
python3dist-preggy"

RDEPENDS:${PN} += "python-abi \
python310-Unidecode \
python310-six"

inherit rpm
