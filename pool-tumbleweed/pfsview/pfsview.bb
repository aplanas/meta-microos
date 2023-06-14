SUMMARY = "Qt-based viewer for HDR files"
DESCRIPTION = "pfsview is a viewer program based on Qt4 for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsview-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "066424d794bdb61302628997652e03f4f60ecaf3290fbb6b345b126ecf536e2f7e35319f97eab24e6b71c18710ca15a0a19cec8461115f0a3be053c0ff7b5400"

RPROVIDES:${PN} += "pfsview"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
