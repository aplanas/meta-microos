SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python311-rdflib-6.1.1-1.13.noarch.rpm"
RPM_HASH = "725ecf9ac547ce97c037c57042137cc3c3b55f11a5fd4049ddeb5d98449810c4a0de3552a0f4ed7fde232a9d13caf2a683c642285f6de900f89293fe7f63bd4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rdflib \
python3.11dist-rdflib \
python311-rdflib \
python3dist-rdflib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-html5lib \
python311-isodate \
python311-pyparsing \
update-alternatives"

inherit rpm
