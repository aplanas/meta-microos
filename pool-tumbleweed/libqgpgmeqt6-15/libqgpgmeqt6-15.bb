SUMMARY = "Programmatic Qt 6 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 6 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgmeqt6-15-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "b1664ae1d81aae5cf9604336723a0fc74d2e982fa8638af8e99743bd23c860cdab7ea846e97d5f51049911c72ef2125a25c3d89fc0af94ca7d69909ac874c9b9"

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
