SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "python39-elasticsearch-dsl-7.4.1-1.3.noarch.rpm"
RPM_HASH = "fad680e924356bd9704b5970c13b048990f0115c439c67c21f5e503e525a395ea17380e3bded0b3bfb33b5f781fd27ff2af664b8946e37e1d9bfd7cf04645815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elasticsearch-dsl \
python39-elasticsearch-dsl \
python3dist-elasticsearch-dsl"

RDEPENDS:${PN} += "-python39-elasticsearch >= 7.0.0 with python39-elasticsearch < 8 \
python-abi \
python39-python-dateutil"

inherit rpm
