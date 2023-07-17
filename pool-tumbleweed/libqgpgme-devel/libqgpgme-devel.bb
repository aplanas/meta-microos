SUMMARY = "Development files for libqgpgme, a Qt 5 library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the bindings to use the library in Qt 5 C++ applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libqgpgme-devel-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "cf414b928e5036e1feb31c78e9f21d2f919109beddcec0c4264d41a7e2fc65045497b638e3e13cfeb4841761a7e0c4e75311c774718a170d64517b131be16689"

RPROVIDES:${PN} += "cmake-QGpgme \
libqgpgme-devel"

RDEPENDS:${PN} += "libgpgme-devel \
libgpgmepp-devel \
libqgpgme15"

inherit rpm
