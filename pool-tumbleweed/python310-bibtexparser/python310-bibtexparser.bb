SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python310-bibtexparser-1.4.0-1.1.noarch.rpm"
RPM_HASH = "bdb84c99916ab61e4da47137d735029a3303eb51d54e4534e23df5c8bb62ba15cdee42352f20582f4d9758f6ca8dc62ff07528815e9519ae2319c9191f5c6e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bibtexparser \
python310-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python310-pyparsing"

inherit rpm
