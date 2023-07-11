SUMMARY = "Deepin graphical user interface library"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer \
work on Deepin."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "dtkwidget-5.5.52-1.8.aarch64.rpm"
RPM_HASH = "e8e3a3c2d47db2768f8c752da094b00402b0ef555d2dfc0c2252a4232592dbf5ddcc05e6216a0797a5b8eb13cb8f1f38badd79a6b2f656a7e2cacda58b2c6a66"

RPROVIDES:${PN} += "dtkwidget"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
