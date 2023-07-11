SUMMARY = "Python 3.10 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.10 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python310-gpg-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "2342f0c3595c994c4f93d26507c1248285c15faadd9ad40e74a6ac5e4c10752ec5f008685f7e1e3ba1ab5e93110841377d163d88bbf1359d48918a02c72a8309"

RPROVIDES:${PN} += "python3.10dist-gpg \
python310-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
