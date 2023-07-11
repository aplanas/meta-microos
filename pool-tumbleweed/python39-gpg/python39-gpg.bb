SUMMARY = "Python 3.9 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.9 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python39-gpg-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "82858b4fdc2d181f2fa457517949ca978a82017709ebf1ff9a829aa390e2b7980cd9188695d08a3c46c14b7034d135009fdcba3aaf88c963848eac14de8d2267"

RPROVIDES:${PN} += "python3.9dist-gpg \
python39-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
