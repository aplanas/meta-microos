SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python310-rdflib-6.1.1-1.12.noarch.rpm"
RPM_HASH = "dad56de54ede197cb1405205d89fc329d80932acc45e12e5b70c37af8d5696be91cd9e8fad9178a5d8a81c3847df00a34a8344f895c047851384958958bca42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rdflib \
python3.10dist(rdflib) \
python310-rdflib \
python3dist(rdflib)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-html5lib \
python310-isodate \
python310-pyparsing \
update-alternatives"

inherit rpm
