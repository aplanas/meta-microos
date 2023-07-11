SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose crypto library based on the code used in \
GnuPG (alpha version)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.2"

RPM_NAME = "libgcrypt20-1.10.2-2.2.aarch64.rpm"
RPM_HASH = "a5ad21c89ea9e8065f32e0121402c7c72592a0aa2b6d4925c4d1fb8e122d4c80d97270225d23f4334e4722d33dd3c058ad61f8b8732226517bdd6f501fe406d9"

RPROVIDES:${PN} += "config-libgcrypt20 \
libgcrypt.so.20 \
libgcrypt20 \
libgcrypt20-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
