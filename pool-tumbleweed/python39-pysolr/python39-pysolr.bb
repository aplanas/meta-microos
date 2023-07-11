SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-pysolr-3.9.0-3.1.noarch.rpm"
RPM_HASH = "94957f5b8dfea664e829901687d9868d9ed60fc46134fd17648cd383c376b0d7c3ffa0e04aed22714a5acd44568415079a1ad1722ff8cdcf31b91a8e3d4894f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysolr \
python39-pysolr \
python3dist-pysolr"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
