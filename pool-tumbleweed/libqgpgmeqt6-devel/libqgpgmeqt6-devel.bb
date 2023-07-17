SUMMARY = "Development files for libqgpgmeqt6, a Qt library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 6 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libqgpgmeqt6-devel-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "502204887252518d87d2db9b1a898da6fcccb6472ff221674a2c7459b4df9c7046673cd8891723ac48e7e7c8d0c98bf3b24a659073b98fdf552b4b3ad0337926"

RPROVIDES:${PN} += "cmake-QGpgmeQt6 \
libqgpgmeqt6-devel"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgmeqt6-15"

inherit rpm
