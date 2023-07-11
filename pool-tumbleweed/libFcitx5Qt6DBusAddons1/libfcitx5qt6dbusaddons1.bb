SUMMARY = "Qt6 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt6DBusAddons1-5.0.17-1.3.aarch64.rpm"
RPM_HASH = "1a2fd8d2a4d960f3c7a0c406c3117a5de90b4abac705426b99c6c866dee67a508981eeaff958be13c38c20f8c1aae6088d5d75bfdc4326fa242228d94dfe2cd3"

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
