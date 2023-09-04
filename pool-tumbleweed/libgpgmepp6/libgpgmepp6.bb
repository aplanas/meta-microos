SUMMARY = "Programmatic C++ library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the C++ bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libgpgmepp6-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "12d9c2720c5d1e4c8b4a76e89a520a534b4c55a24f6f63e984a06ee750ca3bac25b76531a40bd210424215610e27cd3587596576bc09837e80687b4c5104a17d"

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
