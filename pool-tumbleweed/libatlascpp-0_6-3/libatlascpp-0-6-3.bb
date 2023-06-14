SUMMARY = "Remote protocol for the Worldforge MMORPG system"
DESCRIPTION = "This library implements the Atlas protocol for use in client-server \
game applications. It is the standard implementation used by games written \
by the WorldForge project. This library is suitable for linking to either \
clients or servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.6.4"

RPM_NAME = "libatlascpp-0_6-3-0.6.4-2.6.aarch64.rpm"
RPM_HASH = "8cafb930abe44d70c0209c0868c00e7c74783e4c50a7bc89c40258e51c199f23e9cd057a0d399571afef3cc5933ddb60ac9ed7c1f29a4c2b94fcf4b8c9c0d79c"

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
