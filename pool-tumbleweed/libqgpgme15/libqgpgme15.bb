SUMMARY = "Programmatic Qt 5 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 5 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libqgpgme15-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "5349b37f61e1e448ba903c81eca14b8fd0c1f8c76776e46a7582efc84aa8e091cc544974dbd620e7d655561a3b8a971162440b8233c98d52132d28f31bbe13a9"

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
