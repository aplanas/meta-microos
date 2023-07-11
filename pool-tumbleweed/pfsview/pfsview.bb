SUMMARY = "Qt-based viewer for HDR files"
DESCRIPTION = "pfsview is a viewer program based on Qt4 for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsview-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "f0b40b6f2f3192d2c23246a4ecce6ef6be7437724fe6bce7727a923a2e59a62b87a0e91d36d6b47c09ee4c2df2c4b6ee54517d1f1664a062ea97a09262fac238"

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
