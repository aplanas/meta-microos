SUMMARY = "A Qt platform integration plugin"
DESCRIPTION = "The libqt5-dxcbplugin is the Qt platform dxcbp plugin for Deepin Desktop \
Environment."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.12"

RPM_NAME = "libqt5-dxcbplugin-5.6.12-1.1.aarch64.rpm"
RPM_HASH = "9183858c2fe293e80e3870f5e2a6ff16531424c4e5a5dbab404bd88eba5d01a964665c3ef24ab2940420b6ea3583e4c367dde5465361cba1c7072d59ffe61294"

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
