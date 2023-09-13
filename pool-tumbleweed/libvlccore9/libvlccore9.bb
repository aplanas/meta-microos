SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlccore9-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "e6bee96e834b5f0028aba9dffbf8f63e0f46c6a2cfd62b2e69674ba3fa1fb33aa59cd81f9659f327d64dd3d2774de22f03f00590883d312b0b8c412419b0bb21"

RPROVIDES:${PN} += "libvlccore.so.9 \
libvlccore9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libidn.so.12 \
libm.so.6"

inherit rpm
