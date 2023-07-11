SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes1-20230406-1.4.aarch64.rpm"
RPM_HASH = "d576cb8b29f48d62ae9a740139abf9b71640b20fe8a50b17765c5c6f1a4c76c2a263a4a36f1790cb7adf2f31b9d2a48310d86ce52853513315afc4f135fe7979"

RPROVIDES:${PN} += "libcaes.so.1 \
libcaes1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
