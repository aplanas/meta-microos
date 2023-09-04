SUMMARY = "Qt-based viewer for HDR files"
DESCRIPTION = "pfsview is a viewer program based on Qt4 for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsview-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "99c786ee77dc5e392498382f6f66a2f468645f431cc85e286a4d5d0c1ac6b0ef3b8eb44436b75a17648d95beecefafa132e5e01d728b16d67e6a3e430f252e60"

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
