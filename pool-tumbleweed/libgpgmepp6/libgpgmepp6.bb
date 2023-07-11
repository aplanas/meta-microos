SUMMARY = "Programmatic C++ library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the C++ bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libgpgmepp6-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "9cace98622e1e561955e1112b9ee6eb8d1871ff8acc4ccebd897e210736be33b65c8499eb0ba8b2faa0d38d2492e65c29d11a97e4428286f5c97d12023c0f5ce"

RPROVIDES:${PN} += "libgpgmepp.so.6 \
libgpgmepp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpgme.so.11 \
libstdc++.so.6"

inherit rpm
