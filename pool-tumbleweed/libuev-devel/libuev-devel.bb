SUMMARY = "Header files for libuEv"
DESCRIPTION = "Development and header files for libuEv."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "libuev-devel-2.4.0-1.7.aarch64.rpm"
RPM_HASH = "92f578e74196f9d2ff0c03c78dd3272bf689c5680eb0e6da2efcad1ddfc1064b04feae61da2c6507076264a6e2a6a61a37650e6642fb8de8bf5a40a54f3cafa6"

RPROVIDES:${PN} += "libuev-devel \
libuev-devel(aarch-64) \
pkgconfig(libuev)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuev3"

inherit rpm
