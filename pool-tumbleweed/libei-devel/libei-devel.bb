SUMMARY = "Header files for libei, a library for emulated input under Wayland"
DESCRIPTION = "libei is a library for Emulated Input, targeting the Wayland stack."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libei-devel-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "2bb6f6b66237cdcb4254acd941b5af590bb84446c7ce334fff87b6cf6dba0387bc92894474d218cbb14f23c8db43eed39a8fe3b14b5b9b517415db2b71778007"

RPROVIDES:${PN} += "libei-devel \
pkgconfig-libei-1.0 \
pkgconfig-libeis-1.0 \
pkgconfig-liboeffis-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libei.so.1 \
libei1 \
libevdev.so.2 \
pkgconfig-libsystemd"

inherit rpm
