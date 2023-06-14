SUMMARY = "PDF parsing and creation library"
DESCRIPTION = "A cross platform PDF parsing and creation library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libpodofo0_9_8-0.9.8-1.10.aarch64.rpm"
RPM_HASH = "8dd1e1946c1e701732b4dbd86c085d34f4fc17a8b19bebb9eece0513f58872a4a059156ec70cba714c581c3e56a128c37798577d15672736bcd08509ca5e0240"

RPROVIDES:${PN} += "libpodofo.so.0.9.8 \
libpodofo0-9-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
