SUMMARY = "PDF parsing and creation library"
DESCRIPTION = "A cross platform PDF parsing and creation library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libpodofo0_9_8-0.9.8-1.10.aarch64.rpm"
RPM_HASH = "8dd1e1946c1e701732b4dbd86c085d34f4fc17a8b19bebb9eece0513f58872a4a059156ec70cba714c581c3e56a128c37798577d15672736bcd08509ca5e0240"

RPROVIDES:${PN} += "libpodofo.so.0.9.8()(64bit) \
libpodofo0_9_8 \
libpodofo0_9_8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
