SUMMARY = "Development files for libqgpgmeqt6, a Qt library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 6 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgmeqt6-devel-1.20.0-1.2.aarch64.rpm"
RPM_HASH = "794a0e6c4c59a7baac72d87946760f812c3b4dccd413a0b10fb5d9c9f91c5ef9694c59e29df9265cd63239a3a2772df99302c92a4e8be09737afb5c8074ebdc1"

RPROVIDES:${PN} += "cmake-QGpgmeQt6 \
libqgpgmeqt6-devel"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgmeqt6-15"

inherit rpm
