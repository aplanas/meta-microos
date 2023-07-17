SUMMARY = "Python 3.10 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.10 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "python310-gpg-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "1c159dce4866ab01f6ff03907b67471af53777b1d0ccfcf5727aaf20f911bc44472be2055cadd5f39d1f8273de2d60e6de1a42e26d5b497b60227629708d9425"

RPROVIDES:${PN} += "python3.10dist-gpg \
python310-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
