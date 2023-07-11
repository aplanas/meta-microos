SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "1.8.5"

RPM_NAME = "python39-SPARQLWrapper-1.8.5-2.7.noarch.rpm"
RPM_HASH = "918e488ab3a4049d1a4973f2e626e63c9378aa7f532757a01b866b4fd9fea056a913a84d8096823bbfd19531b37280398d676ca8ae8de074f8a6e602140ecb3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sparqlwrapper \
python39-SPARQLWrapper \
python3dist-sparqlwrapper"

RDEPENDS:${PN} += "python-abi \
python39-rdflib"

inherit rpm
