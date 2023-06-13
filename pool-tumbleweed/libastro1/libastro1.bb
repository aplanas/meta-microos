SUMMARY = "Astronomy: Shared Library"
DESCRIPTION = "The astronomy library for the satellites plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libastro1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0d8eb80f5ebfb4ef453f8c227d7f0a533337f2435ab84822ec72efc79eb66ad65201322e8249d72bcbd2babb3280cce0b6c55d64731b70a0334c19a89c262f78"

RPROVIDES:${PN} += "libastro-qt5-1 \
libastro.so.1()(64bit) \
libastro1 \
libastro1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmarblewidget-qt5-28 \
libstdc++.so.6()(64bit)"

inherit rpm
