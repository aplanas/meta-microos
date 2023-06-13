SUMMARY = "Qt5 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt5DBusAddons1-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "037c383a02e901cfd625bbe585675df3e02062bce19d7aea55e5899c47f296ead556f6d55fd2b0024a89baa23157cfd9289164815be747e3b796ef50967a409c"

RPROVIDES:${PN} += "libFcitx5Qt5DBusAddons.so.1()(64bit) \
libFcitx5Qt5DBusAddons1 \
libFcitx5Qt5DBusAddons1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
