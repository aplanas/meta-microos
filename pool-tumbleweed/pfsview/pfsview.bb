SUMMARY = "Qt-based viewer for HDR files"
DESCRIPTION = "pfsview is a viewer program based on Qt4 for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsview-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "066424d794bdb61302628997652e03f4f60ecaf3290fbb6b345b126ecf536e2f7e35319f97eab24e6b71c18710ca15a0a19cec8461115f0a3be053c0ff7b5400"

RPROVIDES:${PN} += "pfsview \
pfsview(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libpfs.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
