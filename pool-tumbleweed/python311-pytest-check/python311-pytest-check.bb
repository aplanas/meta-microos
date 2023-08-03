SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-pytest-check-2.2.0-1.1.noarch.rpm"
RPM_HASH = "089ecb13af3ba24731084c2f387823e56d85a6357f44690c3c2bcf22a578bf93ada70b25e01a6cf38133f6f1bf8a7bd9758519839a56b962eee94bd4d6153a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check \
python3.11dist-pytest-check \
python311-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
