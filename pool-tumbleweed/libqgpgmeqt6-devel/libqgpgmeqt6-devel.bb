SUMMARY = "Development files for libqgpgmeqt6, a Qt library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 6 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libqgpgmeqt6-devel-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "dff2cc44ce0ae7dcf903a11824cf0099a33c278b146942b00cfec14576da48167b482fd74446d208b20951412dec991ae2d9cc32ad01ce63ae74be1c1b73e652"

RPROVIDES:${PN} += "cmake-QGpgmeQt6 \
libqgpgmeqt6-devel"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgmeqt6-15"

inherit rpm
