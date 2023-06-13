SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "1.8.5"

RPM_NAME = "python310-SPARQLWrapper-1.8.5-2.6.noarch.rpm"
RPM_HASH = "6250d8dadf14b160e3b2ed0a1d70186a78fae2266a258c6e28ef626f074c90282523a1f2eaac6e39a3fc14169fbde4390776bef7d4d675d4f2dbf16e7d0fa835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SPARQLWrapper \
python3.10dist(sparqlwrapper) \
python310-SPARQLWrapper \
python3dist(sparqlwrapper)"

RDEPENDS:${PN} += "python(abi) \
python310-rdflib"

inherit rpm
