SUMMARY = "Deepin graphical user interface library"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer \
work on Deepin."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "dtkwidget-5.5.52-1.7.aarch64.rpm"
RPM_HASH = "98221c944b02bb9d1341f29284164d0e1f4075eeb157b5ad59713aebd4fdabad93e556d499bb7b3b7a2a0ea2269df704824109f44fdf0374fce19c9919c57d68"

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
