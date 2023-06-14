SUMMARY = "Library to parse flash media stream URLs"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-0_9-0_9_4-0.9.4-7.6.aarch64.rpm"
RPM_HASH = "7aca7e537a117c85e53c12a732add5a62d5ef9e065049defd90c3b2482ae2b7663255b1c3d7854598ed91fc363a16842e152c2b0594606ac5c0e2aae1b25c719"

RPROVIDES:${PN} += "libquvi \
libquvi-0-9-0-9-4 \
libquvi-0.9-0.9.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
liblua5.4.so.5 \
libproxy.so.1"

inherit rpm
