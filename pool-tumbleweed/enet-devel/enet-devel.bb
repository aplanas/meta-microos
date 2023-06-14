SUMMARY = "Development files for libenet"
DESCRIPTION = "The libenet-devel package contains libraries and header files for \
developing applications that use libenet."
LICENSE = "MIT"

PV = "1.3.17"

RPM_NAME = "enet-devel-1.3.17-1.10.aarch64.rpm"
RPM_HASH = "caf48909bb64900ca673a0e36525a5ec7f695bfe7a3c2517f3e6cef6f4d852017c5b61fe4b42a408451738cae01ea8d808461aaadd785cdeedff0fcb31768f5b"

RPROVIDES:${PN} += "enet-devel \
pkgconfig-libenet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libenet7"

inherit rpm
