SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python39-bibtexparser-1.4.0-1.1.noarch.rpm"
RPM_HASH = "bab288634fdbcd6029d23efa44534dad616b8b7d26300f8a72d2e24be6edae92e22c0a8196c75baef0540ce1f6e7cb4c5589205cd6d59c96dd650100d6b49f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bibtexparser \
python39-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python39-pyparsing"

inherit rpm
