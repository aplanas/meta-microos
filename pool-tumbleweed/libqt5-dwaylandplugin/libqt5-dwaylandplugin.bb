SUMMARY = "A Qt platform integration plugin"
DESCRIPTION = "The libqt5-dxcbplugin is the Qt platform dwayland plugin for Deepin Desktop \
Environment."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.12"

RPM_NAME = "libqt5-dwaylandplugin-5.6.12-2.1.aarch64.rpm"
RPM_HASH = "3975c0a01f6f98307c0c9498f5a521ba15a4187e15ff454878e46895774168adaadeb1b587cc3de48685ca56967cbbabb20fc4c9ce61141b2f6f608dad7d03b6"

RPROVIDES:${PN} += "libdwayland.so \
libqt5-dwaylandplugin"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-cursor.so.0"

inherit rpm
