SUMMARY = "Qt6 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5Qt6DBusAddons1-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "f1522a13ed8c8679025e28dfa197f24b3870ad24e041ecbce94f3d20d0b3e2227964b61035039980447d0836ac00f7da0f938aa1c2551f9656ed40acbaf77cbe"

RPROVIDES:${PN} += "libFcitx5Qt6DBusAddons.so.1 \
libFcitx5Qt6DBusAddons1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
