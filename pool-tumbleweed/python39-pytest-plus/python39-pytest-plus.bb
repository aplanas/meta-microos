SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-pytest-plus-0.4.0-1.1.noarch.rpm"
RPM_HASH = "640201282ea3668aeb89594c1a9517b718d7efa60d43a61f3ca16008f573d0c144da8e2290bec452dce3764700e768f095076b21ff9ecc515a1e1342ea0b8e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-plus \
python39-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
