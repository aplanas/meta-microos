SUMMARY = "Plugin for the Qt6 Interface designer"
DESCRIPTION = "The qwt6-qt6-designer package contains the plugin for the Qt5 User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-designer-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "6d9d0b46e9866fcf18ce43bdf569b780ed5161c2a75451e9ef708d5e77ebc897b2b9ebe5bfaf986a8ea3e02cb957125efc6df11042289ac2d596e50e2cf79f02"

RPROVIDES:${PN} += "libqwt-designer-plugin.so \
qwt6-qt6-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqwt-qt6.so.6.2 \
libstdc++.so.6 \
qwt6-qt6-devel"

inherit rpm
