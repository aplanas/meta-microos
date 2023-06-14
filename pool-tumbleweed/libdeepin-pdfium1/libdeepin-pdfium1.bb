SUMMARY = "The library for deepin-reader"
DESCRIPTION = "The package provide pdf library for deepin-reader"
LICENSE = "GPL-3.0+"

PV = "5.10.23"

RPM_NAME = "libdeepin-pdfium1-5.10.23-1.5.aarch64.rpm"
RPM_HASH = "3181c4d5605596a7da73a2322930dc55c6cd569673e265d2fdb4e7b8d07f075e3ef865b02a54ce3666bd3c4d40aefb7387a7632eefff83151a2b4bf7242f537b"

RPROVIDES:${PN} += "libdeepin-pdfium.so.1 \
libdeepin-pdfium1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libchardet.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
