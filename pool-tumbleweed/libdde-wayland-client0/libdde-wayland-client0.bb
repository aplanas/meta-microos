SUMMARY = "Deepin Wayland client"
DESCRIPTION = "DDE wayland client library with DDE custom protocol."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdde-wayland-client0-1.0.0-1.12.aarch64.rpm"
RPM_HASH = "176de1468e92bde7fc85952cd255e4968428246b6bfcb8b7797dc4fbba7fbbd7c571056d6d33580dbe9f7411ec8979be5c698b410b9e80671217deb90e4580a7"

RPROVIDES:${PN} += "libdde-wayland-client.so.0 \
libdde-wayland-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
