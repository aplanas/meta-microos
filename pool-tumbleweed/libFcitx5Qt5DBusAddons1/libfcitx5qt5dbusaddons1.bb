SUMMARY = "Qt5 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5Qt5DBusAddons1-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "370cab55796a1b49def1cb61420baae0b8c9d8cae2bfa764f6d782f86ad7b9b7b5d7e7a9c8bc4bd90b0f157609321a29ff09830f34de49f5ccc7f38de703e7f9"

RPROVIDES:${PN} += "libFcitx5Qt5DBusAddons.so.1 \
libFcitx5Qt5DBusAddons1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
