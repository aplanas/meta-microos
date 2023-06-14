SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python39-elasticsearch-7.6.0-5.1.noarch.rpm"
RPM_HASH = "4c2921f68e03b7e12fbd1645d3566415c6c84512bc1a10bdcf0d653ee78ae4d544494b91889e8e16c97f217036de9d155094753451c7a5c0f5a602fbd43e089d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elasticsearch \
python39-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python39-elastic-transport"

inherit rpm
