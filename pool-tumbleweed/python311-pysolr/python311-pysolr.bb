SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-pysolr-3.9.0-3.1.noarch.rpm"
RPM_HASH = "7a3ec311468e0dff341533bf04c0c6a6c774a7e9c73379ef34d948ad89eb47506b409a945adff1b2b280b741e57729a68ec81c2c006cf3474c3499d865601bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysolr \
python3.11dist-pysolr \
python311-pysolr \
python3dist-pysolr"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
