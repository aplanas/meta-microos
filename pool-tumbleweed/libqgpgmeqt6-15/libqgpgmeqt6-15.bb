SUMMARY = "Programmatic Qt 6 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 6 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.0"

RPM_NAME = "libqgpgmeqt6-15-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "845a01adf9e0b30e09060403643390151fd07f2024d20514a2edbff5207760feda3d3e048e83ac7fef3844e10f50bcf519ce0a248d2b1b6aeb31089f66969c53"

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
