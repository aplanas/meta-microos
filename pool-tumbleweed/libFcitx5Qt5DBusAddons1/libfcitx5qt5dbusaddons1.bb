SUMMARY = "Qt5 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt5DBusAddons1-5.0.17-1.4.aarch64.rpm"
RPM_HASH = "b9d58cce09d5e2ccfd904495d812868ba73e6fc7bcb3819adb508a43cfbe9e00202349975833a127dbbdce21e720cd38e804fc319430f2a94b3cb2948b8d772f"

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
