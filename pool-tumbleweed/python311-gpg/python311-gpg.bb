SUMMARY = "Python 3.11 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.11 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "python311-gpg-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "f3ca9d725bb3c7e2303c38f7bc20733e23a1bd7badca8048c680f487c8be6dc38d3db2ad044d97fee8e9623b863b4acd53795e5482c3b4925d0e65350483e835"

RPROVIDES:${PN} += "python3-gpg \
python3.11dist-gpg \
python311-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
