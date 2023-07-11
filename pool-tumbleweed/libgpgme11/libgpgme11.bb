SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgme11-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "b76d4a0527cdb235bc0b9d87827b350d78b4eae1141ebad174c6814202e3e117b81e8351c4ccd3438fdcfd985eade40e950be8c5b837853d2d9806a0306a39fb"

RPROVIDES:${PN} += "libgpgme.so.11 \
libgpgme11"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
