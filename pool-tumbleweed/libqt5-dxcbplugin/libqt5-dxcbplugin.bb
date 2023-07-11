SUMMARY = "A Qt platform integration plugin"
DESCRIPTION = "The libqt5-dxcbplugin is the Qt platform dxcbp plugin for Deepin Desktop \
Environment."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.12"

RPM_NAME = "libqt5-dxcbplugin-5.6.12-2.1.aarch64.rpm"
RPM_HASH = "732c2930ee7fa7a4e08ad598a7f5b83f64724ce5876a2792c3996273ab5a81574991e0dacec4bdc5d25312ab1e5ae7290b7a1e531c8819215c69054ad3dbe14d"

RPROVIDES:${PN} += "libdxcb.so \
libqt5-dxcbplugin"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5XcbQpa.so.5 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-icccm.so.4 \
libxcb-shape.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
