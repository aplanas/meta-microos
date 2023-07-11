SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python39-nocaselist-1.0.6-1.5.noarch.rpm"
RPM_HASH = "d8428d771bc2bbfe1ac0209914153127375fc7b7f3e57b0fca6e595c1b4940f798f7a489c7885632e6688f9e0c6e6c169b837fdc340136f46944ae345a06c2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nocaselist \
python39-nocaselist \
python3dist-nocaselist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
