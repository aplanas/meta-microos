SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python39-elastic-transport-8.4.0-4.3.noarch.rpm"
RPM_HASH = "f8c9d8b686d16786d699a4f2b37b80b16bf9f9e0afa89d3eb0857298e34f5bc7f85cf04245602eeb3dbb552963f188dbbf97c367597fa35785b7f8ecdb1b882d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elastic-transport \
python39-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "-python39-urllib3 >= 1.26.2 \
python-abi \
python39-certifi"

inherit rpm
