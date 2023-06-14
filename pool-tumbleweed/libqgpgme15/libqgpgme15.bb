SUMMARY = "Programmatic Qt 5 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 5 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgme15-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "89102494045aaee587623910efa492ffac7ffcd6a799afb0b1931cff01eebbb00434c01e3a9c8cdee522a90ecbdd68669cc320bc952c0b3e6e22b7b6d12620a4"

RPROVIDES:${PN} += "libqgpgme.so.15 \
libqgpgme15"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpg-error.so.0 \
libgpgmepp.so.6 \
libstdc++.so.6"

inherit rpm
