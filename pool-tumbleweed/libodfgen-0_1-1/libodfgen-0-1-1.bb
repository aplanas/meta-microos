SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-0_1-1-0.1.8-3.9.aarch64.rpm"
RPM_HASH = "2ff0f9f9ff5c5309afd82661883c932d616fbb61aa62b62e1c28371824563c15772f510b4e2574895a8087a3a3d6101ea9a85b495c9bb447ac0a5dc5f0e94377"

RPROVIDES:${PN} += "libodfgen-0-1-1 \
libodfgen-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
