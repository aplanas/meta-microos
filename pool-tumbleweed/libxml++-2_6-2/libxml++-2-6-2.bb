SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libxml++-2_6-2-2.42.2-2.4.aarch64.rpm"
RPM_HASH = "16bf3c0eeea8dcc6eb8924885a836d93ab4949d9b153a4df274d6f955b1a74534934929f70fdf8ad3625ecf88d46b173eb66af9e8297309c85b708186f22873e"

RPROVIDES:${PN} += "libxml++-2-6-2 \
libxml++-2.6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
