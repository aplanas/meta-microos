SUMMARY = "Programmatic library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. It uses GnuPG as its back-end."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "gpgme-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "98e74dc7b1b63889bd54083dd4243739132ed3d313003d11123671d70067ede0f2c1b666aa947e7db5fa9782672b53de5444dd117a76674ff1716d04b5a6b0f4"

RPROVIDES:${PN} += "gpgme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgpg-error.so.0 \
libgpgme.so.11 \
libm.so.6"

inherit rpm
