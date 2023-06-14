SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-pysolr-3.9.0-2.6.noarch.rpm"
RPM_HASH = "5050d987d31d92cd3947d7aab64bd19f087a4824c34ab61a6a87a8a35973addfcf648a07641ec49cbd2990c84a01b39648343bb04464d448a1528d5c3e6b686c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysolr \
python3.10dist-pysolr \
python310-pysolr \
python3dist-pysolr"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
