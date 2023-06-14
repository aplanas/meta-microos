SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "gpgme-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "b8cb54844b7347e28c22341591009d74e400e9d27faad5bdecb3d0f12c7b507ef7604e121e21ddb74ea4ea336ce45dcb576f0822b27bc301db664c1916e548f6"

RPROVIDES:${PN} += "gpgme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0 \
libgpgme.so.11 \
libm.so.6"

inherit rpm
