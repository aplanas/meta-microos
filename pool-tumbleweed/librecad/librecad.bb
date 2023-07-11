SUMMARY = "Computer-aided design (CAD) software package for 2D design and drafting"
DESCRIPTION = "LibreCAD is a Qt Computer-aided design (CAD) software package for 2D design \
and drafting."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0"

RPM_NAME = "librecad-2.2.0-1.4.aarch64.rpm"
RPM_HASH = "5a18f0f9a7f571653c126706cbf7c18800c80a33002c422c81af3dc7d7aee7616be83d9e3286009000fa1549b4b49cbf1964bb548b1401b43bc349d1afd2d91c"

RPROVIDES:${PN} += "libalign.so \
libasciifile.so \
libdivide.so \
libgear.so \
libimportshp.so \
liblist.so \
libpicfile.so \
libplotequation.so \
librecad \
libsameprop.so \
libsample.so"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdxfrw.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmuparser.so.2.3.4 \
libshp.so.2 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
