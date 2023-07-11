SUMMARY = "Library for Importing Microsoft Word (tm) Documents"
DESCRIPTION = "The wv2 library is used to import Microsoft Word documents in koffice \
for example."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "libwv2-4-0.4.2-25.6.aarch64.rpm"
RPM_HASH = "68d36a2257124dc27bef37e0b435415c208673ca1c469fa75a5d00ecd52aea35dd5896b07808829b09675292997d2d2e100b0415c777a188404fc74db65c750f"

RPROVIDES:${PN} += "libwv2-4 \
libwv2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgsf-1.so.114 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
