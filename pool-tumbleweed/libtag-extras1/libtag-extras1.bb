SUMMARY = "Extra plugins for TagLib"
DESCRIPTION = "Unofficial TagLib file type plugins maintained by the Amarok project"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "libtag-extras1-1.0.1-24.17.aarch64.rpm"
RPM_HASH = "96a7f79c4df1dfd9f68772941c69954b8ada5bea01ab5eb6ebb9e279706faf1cadfa894313c53f42d26975baad3dbc47ce71ce29b29a5d00b38cae02ab68ce07"

RPROVIDES:${PN} += "libtag-extras.so.1 \
libtag-extras1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
