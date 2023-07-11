SUMMARY = "Library of utility functions shared between sfcb and sfcc"
DESCRIPTION = "This package provides a common library for functions \
shared between sfcb and sfcc."
LICENSE = "EPL-1.0"

PV = "1.0.1"

RPM_NAME = "libsfcUtil0-1.0.1-3.25.aarch64.rpm"
RPM_HASH = "c00cc80a6048e7586f78d29f1cd6202315a4b665c2b0bb11f12f28a31e05f02a32efc5591a44f89455ae71dc49fd4207cf8855f8ea3723edb3770476f8119cee"

RPROVIDES:${PN} += "libsfcUtil.so.0 \
libsfcUtil0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
