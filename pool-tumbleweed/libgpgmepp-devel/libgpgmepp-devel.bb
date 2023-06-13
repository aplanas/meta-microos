SUMMARY = "Development files for libgpgmepp, a C++ library for accessing GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This subpackage contains the headers needed for building applications \
making use of libgpgmepp."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgmepp-devel-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "39354cbb6f23ba8345319adb82d74124e422ed5631d8ae2f00adf29ec9d307daba8922fb316b257639e8100b25d9a503eb49e2a5e14d77b49a51afc5778ca918"

RPROVIDES:${PN} += "libgpgmepp-devel \
libgpgmepp-devel(aarch-64)"

RDEPENDS:${PN} += "glibc-devel \
libassuan-devel \
libgpg-error-devel \
libgpgme-devel \
libgpgmepp6"

inherit rpm
