SUMMARY = "Python 3.10 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.10 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "python310-gpg-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "6f5932986979256faeadbdac7ce59d9365c9489d097d155d7f92ddb3f301124da21385bda3739867d9d0992a5921807b4cf300d9f2fb4f4189f3a97168e13bbc"

RPROVIDES:${PN} += "python3.10dist-gpg \
python310-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
