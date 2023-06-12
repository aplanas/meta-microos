SUMMARY = "Python client for https://www.consul.io/"
DESCRIPTION = "Python client for `Consul.io <http://www.consul.io/>`_"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-python-consul-1.1.0-2.9.noarch.rpm"
RPM_HASH = "54458166e1e3c095c476964659d4a07185a56a29ebca99541de2de8427b7bb45e200f61353e8ad8368c5565afd7a16f1801e5c9f72d90d60b9ffdf6814ab0e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-consul) \
python311-python-consul \
python3dist(python-consul)"
RDEPENDS:${PN} += "python(abi) \
python311-requests \
python311-six"

inherit rpm
