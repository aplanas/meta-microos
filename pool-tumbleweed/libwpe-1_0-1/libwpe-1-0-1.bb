SUMMARY = "Shared library for libwpe"
DESCRIPTION = "General-purpose library developed for the WPE-flavored port of \
WebKit. \
This package contains the shared libary of libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libwpe-1_0-1-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "6d782d89861118150af5cee7747047e58f9295bc1730e165ccd140defd17a12078542c2bd2fb70f87c198abb4a8781042555d540dfce2a41a2915221f9b0a704"

RPROVIDES:${PN} += "libwpe-1-0-1 \
libwpe-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
