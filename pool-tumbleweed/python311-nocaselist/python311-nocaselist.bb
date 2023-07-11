SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python311-nocaselist-1.0.6-1.5.noarch.rpm"
RPM_HASH = "9eca9eb5d4b5acbec70f39b4bc9fad4b491cd2991f195d18f3ecc2a891ffecd0b6717c2b0367e36a4847be102c7cdc676a9bf16b81634f158a7fe9928626b3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nocaselist \
python3.11dist-nocaselist \
python311-nocaselist \
python3dist-nocaselist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
