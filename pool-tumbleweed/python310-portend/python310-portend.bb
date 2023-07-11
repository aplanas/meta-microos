SUMMARY = "TCP port monitoring utilities"
DESCRIPTION = "Use portend to monitor TCP ports for bound or unbound states. \
 \
The portend may also be executed directly. If the function succeeds, it \
returns nothing and exits with a status of 0. If it fails, it prints a \
message and exits with a status of 1. For example:: \
 \
Portend also exposes a ``find_available_local_port`` for identifying \
a suitable port for binding locally::"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-portend-3.1.0-2.3.noarch.rpm"
RPM_HASH = "e167b52449badbe87ce14c332aa673036760a16b315f9e57fc845b6979520ac2d394154da308316e917b529b287d54ea44fcaf78a128556804f3aedc20f69edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-portend \
python310-portend \
python3dist-portend"

RDEPENDS:${PN} += "python-abi \
python310-tempora"

inherit rpm
