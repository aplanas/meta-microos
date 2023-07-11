SUMMARY = "Ditigizer software that converts old graphs into numbers again"
DESCRIPTION = "This digitizing software converts an image file, showing a graph or \
map, into numbers. The image file can come from a scanner, digital \
camera or screenshot. The numbers can be read on the screen, and \
written or copied to a spreadsheet."
LICENSE = "GPL-2.0-or-later"

PV = "12.1"

RPM_NAME = "engauge-digitizer-12.1-2.5.aarch64.rpm"
RPM_HASH = "9f9b19cb2301afe68d23db7a98fdafa0d6b8a6d3fc6abd8d07ccda81c54b09efdcfacc688d49a598e769b74991673e8b771ab84a2303faa86efebc3354006fd4"

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
