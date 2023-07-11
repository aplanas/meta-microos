SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose library of cryptographic building \
blocks.  It is originally based on code used by GnuPG.  It does not \
provide any implementation of OpenPGP or other protocols.  Thorough \
understanding of applied cryptography is required to use Libgcrypt. \
 \
This package contains needed files to compile and link against the \
library."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.10.2"

RPM_NAME = "libgcrypt-devel-1.10.2-2.2.aarch64.rpm"
RPM_HASH = "d30b1be5e4f750f2acfee634b76327dd67ac011d7c276b800f51c440af49cb42f8332c3ab591c89b17547aecbcdf8cad88181bf0a3c6fdcf047f227f3f6a9f85"

RPROVIDES:${PN} += "libgcrypt-devel \
pkgconfig-libgcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgcrypt20 \
libgpg-error-devel \
libgpg-error.so.0 \
pkgconfig-gpg-error"

inherit rpm
