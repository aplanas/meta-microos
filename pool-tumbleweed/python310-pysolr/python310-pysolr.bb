SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-pysolr-3.9.0-3.1.noarch.rpm"
RPM_HASH = "62f02651808cce5a296e1b90482176124bb48803c297b9301e9728e325ec46aca28adf78cc252ae6e166d739341172adff2606e9e3fafe6724fc4b56aa490354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysolr \
python310-pysolr \
python3dist-pysolr"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
