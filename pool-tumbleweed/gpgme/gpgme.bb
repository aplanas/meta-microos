SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "gpgme-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "a2e7ab35ebdc3593fd4da6bc2a04ffc7150c756da4bd25c47e6d77f40fa4adabdb9dbc33e30dd7d90271366558633e8504a9df38c7b7d751e75f69be9a7b16d6"

RPROVIDES:${PN} += "gpgme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0 \
libgpgme.so.11 \
libm.so.6"

inherit rpm
