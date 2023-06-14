SUMMARY = "Computer-aided design (CAD) software package for 2D design and drafting"
DESCRIPTION = "LibreCAD is a Qt Computer-aided design (CAD) software package for 2D design \
and drafting."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0"

RPM_NAME = "librecad-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "d4d1b5266c1939ba0bf0c550a5594baf60b035738de679f9dc370057767c8945984fe3faf1682b703c463fb128c6083264f656cff0b5e3a692cb2010d3461798"

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
