SUMMARY = "Programmatic Qt 5 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 5 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libqgpgme15-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "546f629d643cded10841e636f99c5bcb820ba72565569f92d01b206f02b165b80933e4f973909a0703b340b0531752066e4345a9e9743436eb9e8f19dde16cd9"

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
