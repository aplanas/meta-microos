SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.5"

RPM_NAME = "libwiiuse0-0.15.5-2.3.aarch64.rpm"
RPM_HASH = "8bc0479d2d658055da93ecf51ae5cfd1c6ab2dc7466b88e7941ba168e7a47dd7acfaf607a31902c5039473832c477bb0b84cdde9d6963e89b567b18b2e75c55e"

RPROVIDES:${PN} += "libwiiuse.so.0 \
libwiiuse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
