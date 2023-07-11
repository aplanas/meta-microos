SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python310-rdflib-6.1.1-1.13.noarch.rpm"
RPM_HASH = "c8bf5cce6039e920d7b35c710600b8c4aef2c2363d07707454cb3a197eb2ea479ee69af4b8ca9756b7b4606058c00ab07999c3eef260f6af3598f005aaefd3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rdflib \
python310-rdflib \
python3dist-rdflib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-html5lib \
python310-isodate \
python310-pyparsing \
update-alternatives"

inherit rpm
