SUMMARY = "Shared library for libwpe"
DESCRIPTION = "General-purpose library developed for the WPE-flavored port of \
WebKit. \
This package contains the shared libary of libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libwpe-1_0-1-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "ea4b9d3573ad25dbf129815ae0e7d0b1b41dd0ad38bfd2075ed94cd30ebc4f5bcb47772487335b0ad65797b26f459ed1748afcf3cf9087c92ab60efe8768718a"

RPROVIDES:${PN} += "libwpe-1-0-1 \
libwpe-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
