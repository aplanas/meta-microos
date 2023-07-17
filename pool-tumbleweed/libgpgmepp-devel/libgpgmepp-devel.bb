SUMMARY = "Development files for libgpgmepp, a C++ library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgmepp."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libgpgmepp-devel-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "2d04533adbe60e637a521e8c6b456d1839bb5cb58cedb4cbf86ba4d7fd723606c6ddf53b647c172745b0652c7d8ec8da6d71e81942af4636b62b9b78a88ef3df"

RPROVIDES:${PN} += "libgpgmepp-devel"

RDEPENDS:${PN} += "glibc-devel \
libassuan-devel \
libgpg-error-devel \
libgpgme-devel \
libgpgmepp6"

inherit rpm
