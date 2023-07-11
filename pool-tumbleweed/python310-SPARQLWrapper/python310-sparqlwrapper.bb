SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "1.8.5"

RPM_NAME = "python310-SPARQLWrapper-1.8.5-2.7.noarch.rpm"
RPM_HASH = "eb4b62375b9d68e289f5486e5ae1ab1a8a56fe6d019fcb3e496ca472c39c3d54a07a7d9205964974d9aa09933f9ca787dd9db3002aa9aefc0f4ac5ea5cc80209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sparqlwrapper \
python310-SPARQLWrapper \
python3dist-sparqlwrapper"

RDEPENDS:${PN} += "python-abi \
python310-rdflib"

inherit rpm
