SUMMARY = "Development files for libfcrypto"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfcrypto."
LICENSE = "LGPL-3.0-or-later"

PV = "20221229"

RPM_NAME = "libfcrypto-devel-20221229-1.3.aarch64.rpm"
RPM_HASH = "5f373e30c8580d0277d8b3b2af5c73b378c1c56a0a645764b03f1a73480c43c221c9dc52edf5df81b41101bcd864fb62c13bb13a884ad4ea35c77868e0b7a945"

RPROVIDES:${PN} += "libfcrypto-devel \
pkgconfig-libfcrypto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcrypto1"

inherit rpm
