SUMMARY = "Shared library for libwpe"
DESCRIPTION = "General-purpose library developed for the WPE-flavored port of \
WebKit. \
This package contains the shared libary of libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.14.1"

RPM_NAME = "libwpe-1_0-1-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "7d261f1c814a21a6d0143b62035a7b340b0710d15c4598395341466ce6d6a85c0ee75174ae93406149e139c37470aa58fe8bc16d8c8e091900142e1bb2e85ff9"

RPROVIDES:${PN} += "libwpe-1-0-1 \
libwpe-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
