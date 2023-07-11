SUMMARY = "Library for Mifare card manipulations"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare0-0.4.0-4.32.aarch64.rpm"
RPM_HASH = "7692a2626443ec1b8bd806cc10dc2aa1754323ae06b77bcca3a221999137f3035040b26022fc87654acea31c2749ac4207ac9cc9b141b74fe88a23cea18cd791"

RPROVIDES:${PN} += "libfreefare.so.0 \
libfreefare0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnfc.so.6"

inherit rpm
