SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files.."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python310-bibtexparser-1.2.0-1.7.noarch.rpm"
RPM_HASH = "1fbabd1d7fb0a7a6bd93c2535799d6a14162cdd476fc27f9fe7ac02ced1c878eb93b5224cc4915c6833475219735517fad660a988298c3264a84dd203e47be86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bibtexparser \
python3.10dist(bibtexparser) \
python310-bibtexparser \
python3dist(bibtexparser)"
RDEPENDS:${PN} += "python(abi) \
python310-future \
python310-pyparsing"

inherit rpm
