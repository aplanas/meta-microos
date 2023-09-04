SUMMARY = "Development files for libgpgmepp, a C++ library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgmepp."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libgpgmepp-devel-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "fdfbba1f1c3ba8d5a397cf2052e8c4a296e9846502f729432239b20e4978707d5c72e186fb697dce69011b27c1d858290dd182db351ebf71ac5ca8c22493deef"

RPROVIDES:${PN} += "libgpgmepp-devel"

RDEPENDS:${PN} += "glibc-devel \
libassuan-devel \
libgpg-error-devel \
libgpgme-devel \
libgpgmepp6"

inherit rpm
