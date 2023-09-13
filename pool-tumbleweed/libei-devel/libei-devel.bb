SUMMARY = "Header files for libei, a library for emulated input under Wayland"
DESCRIPTION = "libei is a library for Emulated Input, targeting the Wayland stack."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "libei-devel-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "b29b505610082c78f75f0194c441f43e5347ab0f075a4485289582201c07f3ce0d9b9b825987f508432b6dd3c2e128c3510249a3d6a7a858eb869b10be913871"

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
