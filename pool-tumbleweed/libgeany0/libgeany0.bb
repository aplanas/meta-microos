SUMMARY = "Geany libraries"
DESCRIPTION = "Geany's core library"
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "libgeany0-1.38-3.7.aarch64.rpm"
RPM_HASH = "87476126267c2c9365246253ea53a452f7da9650f427b3f2f6249cee0f8a999dee672c0d911199f57bd3e9dee47bd98d15faaac1a34d320ff59ab20ec9b48477"

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
