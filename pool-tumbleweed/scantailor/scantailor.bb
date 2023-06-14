SUMMARY = "Interactive post-processing tool for scanned pages"
DESCRIPTION = "Scan Tailor is an interactive post-processing tool for scanned pages. \
It performs operations such as page splitting, deskewing, \
adding/removing borders and others. It takes raw scans, and outputs \
pages ready to be printed or assembled into a PDF or DJVU file."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.16"

RPM_NAME = "scantailor-1.0.16-2.18.aarch64.rpm"
RPM_HASH = "42efa7435ddcc9462f872c39b00d6c9bea748333e16400e4268938b212626af18ab5c2604dc8700680bbc82004687fa2411de0edf33fc52beb4dea3d902811f7"

RPROVIDES:${PN} += "scantailor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
