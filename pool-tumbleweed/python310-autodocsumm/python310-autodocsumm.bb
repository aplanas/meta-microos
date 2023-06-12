SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python310-autodocsumm-0.2.11-2.1.noarch.rpm"
RPM_HASH = "c48f43f3df7ebe5ec8dfa3f1cb436f7d94b60ec040fb1bc8e7dc2b1c2875ffadff4889b60144aa1d7f171f959ecd53cb84ad40c43ca5ac7a215e0774d11304c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autodocsumm \
python3.10dist(autodocsumm) \
python310-autodocsumm \
python3dist(autodocsumm)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
