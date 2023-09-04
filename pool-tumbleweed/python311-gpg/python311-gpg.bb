SUMMARY = "Python 3.11 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.11 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "python311-gpg-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "e39b204d75e3a9c32ee270ac5f50c301717aeed705a5cfbcad04b447499e5b43b443c5de8d5c0cded98eb2cee4d4ea18a13b2ffc67e53b981f8e59c8f3f6eadd"

RPROVIDES:${PN} += "python3-gpg \
python3.11dist-gpg \
python311-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
