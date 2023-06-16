SUMMARY = "Development files for GPGME, a C library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgme."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgme-devel-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "38a5b9105103dfb578f89256286268ff5b574f2db30a28ab8c05d6d38538a93e62b7a1ce22f8864c18de691fd818e1d29260cec57d973988692b5b265a8d426d"

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
