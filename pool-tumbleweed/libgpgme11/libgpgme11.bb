SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libgpgme11-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "13443c9f25227fcb63ac24dbd4e627bc43b74f1fc7f7dead8d7cf62282538c6a0c74539ebe57b1c40b13090aea5501ae97ef9f9774603f47ba4d8d83ac41a989"

RPROVIDES:${PN} += "libgpgme.so.11 \
libgpgme11"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
