SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "python310-elasticsearch-dsl-7.4.1-1.3.noarch.rpm"
RPM_HASH = "11d3a51ad43070793f021be726c6953de1cd74c0cef720d44fc1a8c2aea3d5d06551b40d9a4fec1c3840f8603ee1c400303c39a459a5ffa84ca16427d432655c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elasticsearch-dsl \
python310-elasticsearch-dsl \
python3dist-elasticsearch-dsl"

RDEPENDS:${PN} += "-python310-elasticsearch >= 7.0.0 with python310-elasticsearch < 8 \
python-abi \
python310-python-dateutil"

inherit rpm
