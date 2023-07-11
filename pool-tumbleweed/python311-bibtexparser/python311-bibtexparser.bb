SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files.."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python311-bibtexparser-1.2.0-1.9.noarch.rpm"
RPM_HASH = "be3ad1785b7c3060c7f4e01d2ee690b5be255adeff28e0e07903602a6b676d840f5af676f1700be788e5752e6431ee92080ea1b6ba958ac8d11120f71d53345c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bibtexparser \
python3.11dist-bibtexparser \
python311-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-pyparsing"

inherit rpm
