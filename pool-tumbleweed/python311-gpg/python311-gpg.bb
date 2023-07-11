SUMMARY = "Python 3.11 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.11 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python311-gpg-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "3a79f1979c1e95ed422309eb07490540d7aea9cb35a9304655faf96f18c1816c18e5ed51f2855b880d9fab3aadf7774356aae0b41ca4d432953c384d6aa9af47"

RPROVIDES:${PN} += "python3-gpg \
python3.11dist-gpg \
python311-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
