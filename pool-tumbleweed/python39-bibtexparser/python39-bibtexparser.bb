SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files.."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python39-bibtexparser-1.2.0-1.9.noarch.rpm"
RPM_HASH = "482bbba6b2413f8114511f119b278b173dabc93045a61538f68bd82d97d6828450926faad80372f5806421f6625ae0dad34458ae6dc5bd65a83e45a24f7a8462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bibtexparser \
python39-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-pyparsing"

inherit rpm
