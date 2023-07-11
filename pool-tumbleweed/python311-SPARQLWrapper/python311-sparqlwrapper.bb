SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "1.8.5"

RPM_NAME = "python311-SPARQLWrapper-1.8.5-2.7.noarch.rpm"
RPM_HASH = "c76cf06e29151a39d0376a440ee444751d90379d90f552ccdbeb421cf4293b5660dbe8cfaeee09f33ad05839f9ceaf4310b76147a2a791ff82b4d78f6d04db99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SPARQLWrapper \
python3.11dist-sparqlwrapper \
python311-SPARQLWrapper \
python3dist-sparqlwrapper"

RDEPENDS:${PN} += "python-abi \
python311-rdflib"

inherit rpm
