SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python311-digitalocean-1.17.0-2.1.noarch.rpm"
RPM_HASH = "1090249c5ec8f30a580f4572f9a737a8956d399e600930ce90439415715bb6b8545ca8d3bfe59a4538c3a01f97cf583391b0a02a678087300f50671104f0df98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-digitalocean \
python3.11dist-python-digitalocean \
python311-digitalocean \
python3dist-python-digitalocean"

RDEPENDS:${PN} += "python-abi \
python311-jsonpickle \
python311-pytest \
python311-requests \
python311-responses"

inherit rpm
