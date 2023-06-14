SUMMARY = "Deepin Toolkit GUI"
DESCRIPTION = "A GUI module for DDE look and feel for the Deepin Toolkit."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "dtkgui-5.5.25-1.7.aarch64.rpm"
RPM_HASH = "67d2866ebacaa2a2ca6ddb4d2c19f7326543b600228a3af580b71ba42ea660381c02ecf853cf23b266fb05004b279c455c22fd807680161a5b2e50feb4671fdc"

RPROVIDES:${PN} += "dtkgui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
