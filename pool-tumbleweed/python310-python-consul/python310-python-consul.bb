SUMMARY = "Python client for https://www.consul.io/"
DESCRIPTION = "Python client for `Consul.io <http://www.consul.io/>`_"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-python-consul-1.1.0-2.11.noarch.rpm"
RPM_HASH = "bbaeb51f4b4509fc142a43d6dfbaa0b67b0663f7382500eb1cc81fe6835cb082eb4724f30c39e9f24c144d84b9d908a62cd03392aa36830bad92d8b8e095664e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-consul \
python310-python-consul \
python3dist-python-consul"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
