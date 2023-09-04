SUMMARY = "Development files for GPGME, a C library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgme."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libgpgme-devel-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "34221ccc5aec5070341f0c0859cbcdad4f89d62f437ce9a1542e61e169006ef243fd1ffd0f6da504d92099fcebbd4be262a88061ce9934747f68f45a9681a4f8"

RPROVIDES:${PN} += "gpgme-devel \
libgpgme-devel \
pkgconfig-gpgme \
pkgconfig-gpgme-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libassuan-devel \
libgpg-error-devel \
libgpgme11 \
pkgconfig-glib-2.0 \
pkgconfig-gpg-error \
pkgconfig-libassuan"

inherit rpm
