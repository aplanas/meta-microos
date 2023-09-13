SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python39-elasticsearch-8.9.0-1.1.noarch.rpm"
RPM_HASH = "e2bd533cd182c609f522b0a721cb8a5de263374a3a6cfc503023f4e5bf90f7ed9f06dbbc2022f5c7fe0b7e39a4f7a4f9091f598cf4cd52fb755df5b4a0409e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elasticsearch \
python39-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python39-elastic-transport"

inherit rpm
