SUMMARY = "Interactive post-processing tool for scanned pages"
DESCRIPTION = "Scan Tailor is an interactive post-processing tool for scanned pages. \
It performs operations such as page splitting, deskewing, \
adding/removing borders and others. It takes raw scans, and outputs \
pages ready to be printed or assembled into a PDF or DJVU file."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.16"

RPM_NAME = "scantailor-1.0.16-2.19.aarch64.rpm"
RPM_HASH = "97428da96cf996b5abbc90f0a20f2cc71c8544f368376df9609ff6572d313c658d23f71a2390b69688117bda301e21df8b2a2161d273fcd52e3958fbf4161bad"

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
