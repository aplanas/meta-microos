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

RPM_NAME = "python39-portend-3.1.0-2.1.noarch.rpm"
RPM_HASH = "9f692e0050feeaf6e8d71a11bd3de1c47884bf07f152d432ff099fcd19cd033d7b67411ae4c0e8d77b6613155558816733b2ef631aec8efb32cf1dd53a8da34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(portend) \
python39-portend \
python3dist(portend)"

RDEPENDS:${PN} += "python(abi) \
python39-tempora"

inherit rpm
