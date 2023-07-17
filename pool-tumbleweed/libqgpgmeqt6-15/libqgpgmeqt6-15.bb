SUMMARY = "Programmatic Qt 6 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 6 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libqgpgmeqt6-15-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "340ead49c35964c8693e230d66927f20c8764fa84104ada66cd3198c508e540beb0b4d9328fafda9fd2d1b70a3f5f65edf4a9e4e09575c8478649e33b9996235"

RPROVIDES:${PN} += "libqgpgmeqt6-15 \
libqgpgmeqt6.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpg-error.so.0 \
libgpgmepp.so.6 \
libstdc++.so.6"

inherit rpm
