SUMMARY = "Remote protocol for the Worldforge MMORPG system"
DESCRIPTION = "This library implements the Atlas protocol for use in client-server \
game applications. It is the standard implementation used by games written \
by the WorldForge project. This library is suitable for linking to either \
clients or servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.6.4"

RPM_NAME = "libatlascpp-0_6-3-0.6.4-2.7.aarch64.rpm"
RPM_HASH = "1d8b5dcdba149dd2f72dacbe2c45835baa2e415585c71323d8dac7651c71c1e732a025f5346d4557e29c831d399496db0c0c99047f98465cc26c63949f3df704"

RPROVIDES:${PN} += "libAtlas-0.6.so.3 \
libAtlasCodecs-0.6.so.3 \
libAtlasFilters-0.6.so.3 \
libAtlasFunky-0.6.so.3 \
libAtlasMessage-0.6.so.3 \
libAtlasNet-0.6.so.3 \
libAtlasObjects-0.6.so.3 \
libatlascpp-0-6-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
