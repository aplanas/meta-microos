SUMMARY = "Development files for libgpgmepp, a C++ library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgmepp."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgmepp-devel-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "f474d4c18a71bc586297ec950a1519a82ae447157d0e807ae82cb61df72a10dfe003ac6339e75fa3cc1c715ebc36c64eb9e7f8b6392952f317badb4e36dedb3c"

RPROVIDES:${PN} += "libgpgmepp-devel"

RDEPENDS:${PN} += "glibc-devel \
libassuan-devel \
libgpg-error-devel \
libgpgme-devel \
libgpgmepp6"

inherit rpm
