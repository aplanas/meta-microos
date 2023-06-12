SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python311-rdflib-6.1.1-1.12.noarch.rpm"
RPM_HASH = "5df3bdb1dd1aab1272a6460b2342933e7a41058c6725baa6996754395016db2edbfc27da098967a5bc8f9ad78dcb328d2353f0467e92b02977a3f6be630d7c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rdflib) \
python311-rdflib \
python3dist(rdflib)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-html5lib \
python311-isodate \
python311-pyparsing \
update-alternatives"

inherit rpm
