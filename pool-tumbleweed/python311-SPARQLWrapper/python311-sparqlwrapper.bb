SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "1.8.5"

RPM_NAME = "python311-SPARQLWrapper-1.8.5-2.6.noarch.rpm"
RPM_HASH = "9ed1b7ade9db61bfc36e3dedfa84e3c0b7f330a2827cffaf4aa348a77a0b158882301a0dd1f9ff75a2db82d247016f7bd426f29fc33c7ab374e93ba1ab56c827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sparqlwrapper) \
python311-SPARQLWrapper \
python3dist(sparqlwrapper)"

RDEPENDS:${PN} += "python(abi) \
python311-rdflib"

inherit rpm
