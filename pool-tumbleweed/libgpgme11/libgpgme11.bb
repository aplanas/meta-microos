SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgme11-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "be11357f01a6d875f59152468588878a67a6f32b310455ffcd3d0ab958476a5c7e1fbee6609ab2dd96a1efccef866e804770e5d2e13387d640ea1e5c7fd00ad3"

RPROVIDES:${PN} += "libgpgme.so.11 \
libgpgme11"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
