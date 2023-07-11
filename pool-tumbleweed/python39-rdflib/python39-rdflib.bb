SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python39-rdflib-6.1.1-1.13.noarch.rpm"
RPM_HASH = "282475c067aaa1dca5305273939ed4e22cbdb965ec547a22c5d77011c42dfcf2318dedc89921ef74b9ced4f764b1bafeb533bd948ec1ab24f2f98f3afc1d6b05"
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
