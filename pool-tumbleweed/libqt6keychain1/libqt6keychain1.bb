SUMMARY = "Qt 6 keychain library"
DESCRIPTION = "The Qt 6 keychain library."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "libqt6keychain1-0.13.2-4.1.aarch64.rpm"
RPM_HASH = "dbd4a73107fa916811e6ac8577845e8ffda887ed5ca7893e6897413f52fa7847c23cbef7fd735b7d6fe1d4327241530ccec88a998cb3374675118b41df803927"

RPROVIDES:${PN} += "libqt6keychain.so.1()(64bit) \
libqt6keychain1 \
libqt6keychain1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
