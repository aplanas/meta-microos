SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "gpgme-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "87821c41751f5fd2b874363e06c9cf8798be4b1cd682f4701d2e0d5f1ba1c033c8d68eb93fb2b6232f4e32ac20d0a239c75cf99994f4c75ff3bc009208acf99c"

RPROVIDES:${PN} += "gpgme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0 \
libgpgme.so.11 \
libm.so.6"

inherit rpm
