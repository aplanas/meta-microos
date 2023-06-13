SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-pysolr-3.9.0-2.6.noarch.rpm"
RPM_HASH = "7466af4e01fc4ed0ae79916351f7baadd59a15fe9107449df9008dea90a7257c52c05687cbe1203a6839cf40567628e1ce742d89379741a6ba3c66aff99dfe6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pysolr) \
python311-pysolr \
python3dist(pysolr)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
