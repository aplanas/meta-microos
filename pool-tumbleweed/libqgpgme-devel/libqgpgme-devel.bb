SUMMARY = "Development files for libqgpgme, a Qt 5 library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 5 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgme-devel-1.20.0-1.2.aarch64.rpm"
RPM_HASH = "92055ca9be7e0eeb360117a2d38de0826359785879b72f412351dd2304ce180051f28eb36a7c8d60d11d6a9d005888656f85c70f2c06cb4965b15eb94de22975"

RPROVIDES:${PN} += "cmake-QGpgme \
libqgpgme-devel"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgme15"

inherit rpm
