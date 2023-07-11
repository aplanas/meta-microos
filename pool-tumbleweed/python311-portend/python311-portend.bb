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

RPM_NAME = "python311-portend-3.1.0-2.3.noarch.rpm"
RPM_HASH = "5a1d24b825ffd0d8eaef946d99049d3ae2858ef85a4c1828bbbed5580349c0f2f4c50efaeef8153c7fbba78e60ab3e40e6f75cf7a6943303992dd261182d35f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portend \
python3.11dist-portend \
python311-portend \
python3dist-portend"

RDEPENDS:${PN} += "python-abi \
python311-tempora"

inherit rpm
