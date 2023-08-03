SUMMARY = "Qt6 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "libFcitx5Qt6DBusAddons1-5.0.17-1.4.aarch64.rpm"
RPM_HASH = "7489e9cd2ff82325eb521a2b7f27eb3cffc3d005ce9c45c7d35294d4ecb44bc7bf42d11d51124afb1f2ebde196db33da1ba73b6bcb543b5112c8ca9edd681e8a"

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
