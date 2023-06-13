SUMMARY = "Geany libraries"
DESCRIPTION = "Geany's core library"
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "libgeany0-1.38-3.7.aarch64.rpm"
RPM_HASH = "87476126267c2c9365246253ea53a452f7da9650f427b3f2f6249cee0f8a999dee672c0d911199f57bd3e9dee47bd98d15faaac1a34d320ff59ab20ec9b48477"

RPROVIDES:${PN} += "libgeany.so.0()(64bit) \
libgeany0 \
libgeany0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
