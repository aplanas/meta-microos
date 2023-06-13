SUMMARY = "Python 3.11 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.11 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python311-gpg-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "f71770e60e78a17dad7bbe8047070db3cd20a32b007084dbe45a6d280d93d836e5b1710dc5ef15a2a551b954f3ef48b3339e9358bda439fb573d73931e9a3e60"

RPROVIDES:${PN} += "python3.11dist(gpg) \
python311-gpg \
python311-gpg(aarch-64) \
python3dist(gpg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
python(abi)"

inherit rpm
