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

RPM_NAME = "python39-portend-3.1.0-2.3.noarch.rpm"
RPM_HASH = "7eeebfe6c6edde11df9a43279b712c6e0aa06a8c884e5be5394103da5f395b940012c65a247ad0675115c82b1f81a4c9d66edb74f7d69ad47a9da8cc82fce775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-portend \
python39-portend \
python3dist-portend"

RDEPENDS:${PN} += "python-abi \
python39-tempora"

inherit rpm
