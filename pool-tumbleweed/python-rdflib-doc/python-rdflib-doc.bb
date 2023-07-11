SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python-rdflib-doc-6.1.1-1.13.noarch.rpm"
RPM_HASH = "e74dc7af0d8d571006750be641a616b5d9f09a8d70107a28018228cc5df8aa4c6eb8cdd3b9e2d7904851341d5355fd68c267a46cabfe47f5ab282212894b5134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rdflib-doc \
python310-rdflib-doc \
python311-rdflib-doc \
python39-rdflib-doc"

RDEPENDS:${PN} += ""

inherit rpm
