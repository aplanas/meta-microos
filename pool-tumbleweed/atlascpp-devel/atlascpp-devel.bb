SUMMARY = "Development files for the Atlas protocol C++ implementation"
DESCRIPTION = "This library implements the Atlas protocol for use in client-server \
game applications. It is the standard implementation used by games written \
by the WorldForge project. This library is suitable for linking to either \
clients or servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.6.4"

RPM_NAME = "atlascpp-devel-0.6.4-2.7.aarch64.rpm"
RPM_HASH = "17dde0642fea7024b51bfc592809cfbaa2ce56db208b7ec435b6cc19c9dd80e70f19664349925cf9473156d98d7e831756a7965470787c73f0c6b827b779eeac"

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
