SUMMARY = "Development files for libqgpgme, a Qt 5 library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 5 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libqgpgme-devel-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "ad8b8a08f483a3deda83181f3773e52d7eeee17cdbc1d5dbdfcedc4d23f00dd14dce16deb846d6f34fc26aaa40e0192d5c7df4dcca8ea1fbfd8b813e3cbf2c89"

RPROVIDES:${PN} += "cmake-QGpgme \
libqgpgme-devel"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgme15"

inherit rpm
