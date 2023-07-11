SUMMARY = "Programmatic Qt 5 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 5 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgme15-1.20.0-1.2.aarch64.rpm"
RPM_HASH = "42c2473158f4136298210a83c608d3b5df47e734a826d9e663da84442456b58e01c6ddf45a3e1a3e85fbb6dbaf3f71cccebe0dcd57676429faef8ceda5e40008"

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
