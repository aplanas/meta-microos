SUMMARY = "Graphical user interface to svgcleaner"
DESCRIPTION = "This package provides a Qt graphical user interface to svgcleaner."
LICENSE = "GPL-2.0-only"

PV = "0.9.5"

RPM_NAME = "svgcleaner-gui-0.9.5-2.25.aarch64.rpm"
RPM_HASH = "ed36094aed728edb6c07a6df24219142484ad78a901a5760e6676b9760f5383f6fa2ea010d22de9874902df370bd6eca37683fa73818cbd7262b09385d9d23e1"

RPROVIDES:${PN} += "application() \
application(svgcleaner.desktop) \
svgcleaner-gui \
svgcleaner-gui(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
p7zip \
svgcleaner"

inherit rpm
