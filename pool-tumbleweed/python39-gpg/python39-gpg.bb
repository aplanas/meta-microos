SUMMARY = "Python 3.9 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.9 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "python39-gpg-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "8edf73108badbef2dde86331052ecbc70eb38035a732a1589bf1586e6bf6cab0a908600152790d6f56ea0abf68ba17cc80e036777885a06a52fa136db79842a0"

RPROVIDES:${PN} += "python3.9dist-gpg \
python39-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
python-abi"

inherit rpm
