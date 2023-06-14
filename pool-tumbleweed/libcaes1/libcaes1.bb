SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes1-20230406-1.1.aarch64.rpm"
RPM_HASH = "18ff44f843cfee017359b38c08cec177a864c95405cd41f43f0cef7273cbb514b03b867026f21dee3e140ce3f5249799a3ceaea6498fbb85eb6cc4ced345c443"

RPROVIDES:${PN} += "libcaes.so.1 \
libcaes1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
