SUMMARY = "A Qt platform integration plugin"
DESCRIPTION = "The libqt5-dxcbplugin is the Qt platform kwayland-shell plugin for Deepin Desktop \
Environment."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.12"

RPM_NAME = "libqt5-kwayland-shellplugin-5.6.12-2.1.aarch64.rpm"
RPM_HASH = "f7d40240082422d34be6bf5abce00f1251eb3061e92e556995ef099fd4e421b61abae45583174a3d6d63cff4f992e56bba1d779cbbe88103a02f3c407c3ee029"

RPROVIDES:${PN} += "libkwayland-shell.so \
libqt5-kwayland-shellplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libDWaylandClient.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
