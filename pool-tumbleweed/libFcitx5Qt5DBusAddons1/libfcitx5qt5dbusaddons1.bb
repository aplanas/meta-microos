SUMMARY = "Qt5 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt5DBusAddons1-5.0.17-1.3.aarch64.rpm"
RPM_HASH = "03f14aa948004c847f09ab28544093c3e58f22165c40314061578087475a698ad141d67e108a26c10fe3ae701473d9d5fd0c41e2d520933523507c1492d8db15"

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
