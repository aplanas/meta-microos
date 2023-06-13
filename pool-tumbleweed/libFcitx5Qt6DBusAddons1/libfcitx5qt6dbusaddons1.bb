SUMMARY = "Qt6 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt6DBusAddons1-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "df3b192e129551ae3ccb8e2b5fb386a7d0c5395328463e0e137b959ca523588aa6ab488d5d7bce571846eab7bf3b476f17e07a76ea9bba5bb8c158cad5165e61"

RPROVIDES:${PN} += "libFcitx5Qt6DBusAddons.so.1()(64bit) \
libFcitx5Qt6DBusAddons1 \
libFcitx5Qt6DBusAddons1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
