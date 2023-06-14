SUMMARY = "Utility programs making use of libfido2, a library for FIDO U2F and FIDO 2.0"
DESCRIPTION = "This package contains utilities to use FIDO U2F and FIDO 2.0 protocols."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-utils-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "07c0c86b2ea3eddd42c03d5d7f8cedc2f116a58a43f7191f563cb409a4783489b93334252409480d4b13e3ebee379324fdf595175ec5fd96b0f008e352dc0d4d"

RPROVIDES:${PN} += "libfido2-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcbor.so.0.10 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1"

inherit rpm
