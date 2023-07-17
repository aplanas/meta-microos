SUMMARY = "Python 3.9 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.9 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "python39-gpg-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "5810f38701fdd841d0c2d403086631fdae0558b34196d2223688fcd2ec8d6df7dbfc0483ecf8dfcc8f7cb86761b0e9d3b002e2d2e84b7f51125da130c98ba208"

RPROVIDES:${PN} += "python3.9dist-gpg \
python39-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
