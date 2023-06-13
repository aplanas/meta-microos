SUMMARY = "Computer-aided design (CAD) software package for 2D design and drafting"
DESCRIPTION = "LibreCAD is a Qt Computer-aided design (CAD) software package for 2D design \
and drafting."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0"

RPM_NAME = "librecad-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "d4d1b5266c1939ba0bf0c550a5594baf60b035738de679f9dc370057767c8945984fe3faf1682b703c463fb128c6083264f656cff0b5e3a692cb2010d3461798"

RPROVIDES:${PN} += "application() \
application(librecad.desktop) \
libalign.so()(64bit) \
libasciifile.so()(64bit) \
libdivide.so()(64bit) \
libgear.so()(64bit) \
libimportshp.so()(64bit) \
liblist.so()(64bit) \
libpicfile.so()(64bit) \
libplotequation.so()(64bit) \
librecad \
librecad(aarch-64) \
libsameprop.so()(64bit) \
libsample.so()(64bit) \
mimehandler(image/vnd.dxf)"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdxfrw.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmuparser.so.2.3.4()(64bit) \
libshp.so.2()(64bit) \
libstdc++.so.6()(64bit) \
shared-mime-info"

inherit rpm
