SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python311-bibtexparser-1.4.0-1.1.noarch.rpm"
RPM_HASH = "8d3f30c96c641e217c7656280aaab861457be8b1b09f77bef9e8b0d0e1b6f92ba0fc8c537ae2b74ae98162375fa408de4a8d826ac3a65bcaaad32dde557c9ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bibtexparser \
python3.11dist-bibtexparser \
python311-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python311-pyparsing"

inherit rpm
