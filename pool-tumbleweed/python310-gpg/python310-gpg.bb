SUMMARY = "Python 3.10 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.10 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python310-gpg-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "ebb8252ced1bdf38dd33f6903d4853c413d048af10ba983d26981b1564b746ab4931b41e0738041b53dc1c1ad59c47f97c515b258a31a5dbe01620521ef7c46d"

RPROVIDES:${PN} += "python3-gpg \
python3.10dist(gpg) \
python310-gpg \
python310-gpg(aarch-64) \
python3dist(gpg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgpgme.so.11()(64bit) \
python(abi)"

inherit rpm
