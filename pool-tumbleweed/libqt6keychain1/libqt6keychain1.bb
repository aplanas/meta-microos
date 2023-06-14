SUMMARY = "Qt 6 keychain library"
DESCRIPTION = "The Qt 6 keychain library."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "libqt6keychain1-0.13.2-4.1.aarch64.rpm"
RPM_HASH = "dbd4a73107fa916811e6ac8577845e8ffda887ed5ca7893e6897413f52fa7847c23cbef7fd735b7d6fe1d4327241530ccec88a998cb3374675118b41df803927"

RPROVIDES:${PN} += "libqt6keychain.so.1 \
libqt6keychain1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
