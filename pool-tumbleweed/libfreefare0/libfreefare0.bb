SUMMARY = "Library for Mifare card manipulations"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare0-0.4.0-4.31.aarch64.rpm"
RPM_HASH = "4609a71352535460f314b8febe8a9454f26be18821f6137d36dae76507112651ac0ec1b5768ee9449a55161bda2134578bfaaf47e1ba9e3d7b2e321f72e6d342"

RPROVIDES:${PN} += "libfreefare.so.0 \
libfreefare0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnfc.so.6"

inherit rpm
