SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python39-digitalocean-1.17.0-2.1.noarch.rpm"
RPM_HASH = "27f7f651b32dec14c96f00e1d19881d7deaddfcafcf93f1f4bfbb50117f1ae001b34d9fd8d67c621a3a2afb6ad1331116d7813e8d929ba8d8648183483b7ec15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-digitalocean \
python39-digitalocean \
python3dist-python-digitalocean"

RDEPENDS:${PN} += "python-abi \
python39-jsonpickle \
python39-pytest \
python39-requests \
python39-responses"

inherit rpm
