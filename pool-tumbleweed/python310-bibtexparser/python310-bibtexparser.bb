SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files.."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python310-bibtexparser-1.2.0-1.9.noarch.rpm"
RPM_HASH = "b98579b004a2aefef2c95287a02b70d660ca6f47f09a6b78f8213602544c64ef2d6476893730c681ca6985912585a984d31cf3b941e1615aa19bbe7ba6e23e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bibtexparser \
python310-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-pyparsing"

inherit rpm
