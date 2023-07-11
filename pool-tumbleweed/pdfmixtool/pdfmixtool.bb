SUMMARY = "Split, Merge, Rotate and Mix PDF Files"
DESCRIPTION = "An application to split, merge, rotate, mix and create multipage PDF files."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "pdfmixtool-1.1.1-2.4.aarch64.rpm"
RPM_HASH = "c9149d9a9e8ca15e4948510008dea07a3eb2efce7dea0f70014e520e36b83ab289413f1d2760f392c2db4a5a8b3676bf2ac853d8eab91db76981d3cfaede157a"

RPROVIDES:${PN} += "pdfmixtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqpdf.so.29 \
libstdc++.so.6"

inherit rpm
