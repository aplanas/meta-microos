SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libgpgme11-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "f598ed1aa4bd8458f80090f72b05fe3cc557783c65ef98a703919c7f1b72d8adc536825c00c67fadf8276f1297c4ef2a76f8a85bf26a892a5a1fc3b4cdbf5ca1"

RPROVIDES:${PN} += "libgpgme.so.11 \
libgpgme11"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
