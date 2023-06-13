SUMMARY = "Development files for libqgpgme, a Qt 5 library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 5 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgme-devel-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "898777fba4c58f22deb4ecb71b309a55fa7711ffd8c277df9a8735974dab8f7b168948be83dc168efed5415f1e27bf852f59143a06ae4ee7e78dfa4e79ad2209"

RPROVIDES:${PN} += "cmake(QGpgme) \
libqgpgme-devel \
libqgpgme-devel(aarch-64)"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgme15"

inherit rpm
