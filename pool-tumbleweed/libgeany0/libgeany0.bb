SUMMARY = "Geany libraries"
DESCRIPTION = "Geany's core library"
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "libgeany0-1.38-3.8.aarch64.rpm"
RPM_HASH = "4a32e6f5470a6829bda1babb75b1bc7812590e6752a51f03ad453ffff1946f18ed4a13d70b469368ae5e3ddba8b038173c3625033c6fbf546ee4f61c490ab076"

RPROVIDES:${PN} += "libgeany.so.0 \
libgeany0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
