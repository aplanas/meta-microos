SUMMARY = "Programmatic C++ library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the C++ bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgmepp6-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "1e65fc5302815e096265ccc19423f6d1bf994f40e008507657a9ce9c2efa456626e833c1902bae3511209788d6eada72bb68e50c919b88685ae1e48acc41546f"

RPROVIDES:${PN} += "libgpgmepp.so.6()(64bit) \
libgpgmepp6 \
libgpgmepp6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgpgme.so.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
