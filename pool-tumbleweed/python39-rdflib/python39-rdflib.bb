SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python39-rdflib-6.1.1-1.12.noarch.rpm"
RPM_HASH = "9823e478d58e5b298799ec3da1cbef241ec321cb0379f963ade87bdfed9ca09f1932f18c5aa036cf0a22a76ab3d92eae80a5430f935de94c662adeef4c3b94ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rdflib \
python39-rdflib \
python3dist-rdflib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-html5lib \
python39-isodate \
python39-pyparsing \
update-alternatives"

inherit rpm
