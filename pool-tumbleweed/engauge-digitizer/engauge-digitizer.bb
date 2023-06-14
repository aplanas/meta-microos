SUMMARY = "Ditigizer software that converts old graphs into numbers again"
DESCRIPTION = "This digitizing software converts an image file, showing a graph or \
map, into numbers. The image file can come from a scanner, digital \
camera or screenshot. The numbers can be read on the screen, and \
written or copied to a spreadsheet."
LICENSE = "GPL-2.0-or-later"

PV = "12.1"

RPM_NAME = "engauge-digitizer-12.1-2.4.aarch64.rpm"
RPM_HASH = "4a524fd3cb3b3e04b41cdbfcc0d2203f3d973b724f794a093158e8c415a7902f0c1e1a26d524563b1eb4d33a6af4005ebe3213ef1a4657e774604f91f8c362d1"

RPROVIDES:${PN} += "engauge-digitizer"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
liblog4cpp.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libpoppler-qt5.so.1 \
libstdc++.so.6"

inherit rpm
