SUMMARY = "Python 3.9 bindings for GPGME, a library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library from Python 3.9 applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python39-gpg-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "a4bb07ff097f59997c8a36d637bb8f7a4e724bacd7ed0a72fbab8fccc8109d2148291236c0b7e4994aa950542ffd439509587938fbe8969d915d978241e92bf8"

RPROVIDES:${PN} += "python3.9dist(gpg) \
python39-gpg \
python39-gpg(aarch-64) \
python3dist(gpg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
python(abi)"

inherit rpm
