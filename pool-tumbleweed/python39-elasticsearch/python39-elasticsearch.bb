SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python39-elasticsearch-7.6.0-5.3.noarch.rpm"
RPM_HASH = "e63c595669302da2dffbb2bf8ed957a9c39cf874339e09fb9bdd17a47ccada3e9ccb73eb2ff19fb6ede3373e50fedfeff2832fdc0a524b63086c2788ec90f83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elasticsearch \
python39-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python39-elastic-transport"

inherit rpm
