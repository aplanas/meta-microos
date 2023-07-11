SUMMARY = "Library for encryption formats"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221229"

RPM_NAME = "libfcrypto1-20221229-1.3.aarch64.rpm"
RPM_HASH = "88e5818f6cb9f2d6f614af6e9d3c486b5eb68e4d1c68165d2d1a35021fea2c0e20d8c9e44618e4862af32d98ab09ec7aa16aeea1c68e1602015ad4bc6656a9ba"

RPROVIDES:${PN} += "libfcrypto.so.1 \
libfcrypto1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
