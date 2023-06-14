SUMMARY = "Split, Merge, Rotate and Mix PDF Files"
DESCRIPTION = "An application to split, merge, rotate, mix and create multipage PDF files."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "pdfmixtool-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "2df9ec9cf63acae7cd3e02ca1b0f52fe189c19fd440526264f86eb43f4be26b0b3fc1ca3a3e3124f1598436202c58476fc843a0995ee47fa64d426612c419a75"

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
