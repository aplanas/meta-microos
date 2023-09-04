SUMMARY = "Qt 6 keychain library"
DESCRIPTION = "The Qt 6 keychain library."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "libqt6keychain1-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "586bfc0cd81b053bfb78ed9241ae2035dcf12ba30337f7584577d14cc0c769cfc4fda0688b4068a272ae32283a3e58196891a839df6e876590bc0b257733a58d"

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
