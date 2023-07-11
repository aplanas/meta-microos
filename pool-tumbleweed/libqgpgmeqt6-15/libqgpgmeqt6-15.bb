SUMMARY = "Programmatic Qt 6 library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the Qt 6 bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "libqgpgmeqt6-15-1.20.0-1.2.aarch64.rpm"
RPM_HASH = "581a57fd6c3ec7ecec2938169f8b895eaf7086d47916d4835adf4067ecae5260ef8d100b0e23673eedc6440f92e636d7db794235f1ff8e6d0caf9d78f9f28d39"

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
