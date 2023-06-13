SUMMARY = "Deepin Wayland client"
DESCRIPTION = "DDE wayland client library with DDE custom protocol."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdde-wayland-client0-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "a44e9f711d730ad661a6804e111d0f4d7d66f02ee8148418aebea4d351b198aa5780cd7fb2191de14e41dcff23f361b7d41486fe6a2dee82ea8c576a5b87d619"

RPROVIDES:${PN} += "libdde-wayland-client.so.0()(64bit) \
libdde-wayland-client0 \
libdde-wayland-client0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
