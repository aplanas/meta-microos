SUMMARY = "Development files for the Atlas protocol C++ implementation"
DESCRIPTION = "This library implements the Atlas protocol for use in client-server \
game applications. It is the standard implementation used by games written \
by the WorldForge project. This library is suitable for linking to either \
clients or servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.6.4"

RPM_NAME = "atlascpp-devel-0.6.4-2.6.aarch64.rpm"
RPM_HASH = "8704e8816086b44ab94475dd7564ebb42952dd2b7ff9424ac8f4e9ea3f4bc15b0fc0a531112e1b25df7743de682e2789037e8359e1694db94f7e43782b8d9d40"

RPROVIDES:${PN} += "atlascpp-devel \
pkgconfig-atlascpp-0.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libAtlas-0.6.so.3 \
libAtlasCodecs-0.6.so.3 \
libAtlasMessage-0.6.so.3 \
libatlascpp-0-6-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
