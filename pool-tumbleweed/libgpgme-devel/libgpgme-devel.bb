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

RPM_NAME = "libgpgme-devel-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "72bf3a1b199520ee2bb05c49b4419ca41e223e3ae6115f7ce16ec6f3d48a1cc55394106b9a0f96eb1452e8079b654ac9fa44168b5b8bc69bcc6643f13df5efb8"

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
