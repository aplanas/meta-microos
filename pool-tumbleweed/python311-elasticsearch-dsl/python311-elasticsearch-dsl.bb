SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "python311-elasticsearch-dsl-7.4.1-1.3.noarch.rpm"
RPM_HASH = "7df462f89c8813e7eee8f63e144f19d4432605c6f7f9a1f12d4255f05906fba6cf07fccb4217ab73d39a9c06820cdae005cadff79c88601c1f5b85fbfbfa849d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch-dsl \
python3.11dist-elasticsearch-dsl \
python311-elasticsearch-dsl \
python3dist-elasticsearch-dsl"

RDEPENDS:${PN} += "-python311-elasticsearch >= 7.0.0 with python311-elasticsearch < 8 \
python-abi \
python311-python-dateutil"

inherit rpm
