SUMMARY = "Development files for GPGME, a C library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgme."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libgpgme-devel-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "47c958365006ae53cd58271af4883725936ce46a85745752c9430a5783a42a1f0a2d88d433d35df5313fd277106d0cb2b71cc27dc06c9e0cf51932662c131a50"

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
