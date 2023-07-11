SUMMARY = "OSM primitives for kosmindoormap"
DESCRIPTION = "OSM primitives for kosmindoormap."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "libKOSM1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e5b5b04f9dafcbcb2abb3ad0fdf22778be17d27c07dc6330629f536aaa3709dbcc146d24e30d0bb40a26d7095e029786c491683582fbd8e42e1eb3335d3ce31c"

RPROVIDES:${PN} += "libKOSM.so.1 \
libKOSM1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
