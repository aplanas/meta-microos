SUMMARY = "Qt 6 keychain library"
DESCRIPTION = "The Qt 6 keychain library."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "libqt6keychain1-0.13.2-4.2.aarch64.rpm"
RPM_HASH = "30a986f669816e0c38dd9c236e813b3142741a9677016926c8a87bfc9a742e85cda23572590048543baefdc0393337c29cd570a2f69d79fb3a6c05a31bf49707"

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
