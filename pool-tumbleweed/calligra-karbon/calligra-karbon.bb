SUMMARY = "Vector Drawing Application"
DESCRIPTION = "Karbon is the vector drawing application of the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-karbon-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "d6faec538046e1e413b53183952a2c57eaa0af1ef879472fd23bd87aa9a36ef7dd92da82c7415bf2ff48dece78dae937b3c4c8c7af016eda92c4047bc475f3fa"

RPROVIDES:${PN} += "application() \
application(org.kde.karbon.desktop) \
calligra-karbon \
calligra-karbon(aarch-64) \
libkarboncommon.so.17()(64bit) \
libkarbonui.so.17()(64bit) \
libkdeinit5_karbon.so()(64bit) \
metainfo() \
metainfo(org.kde.karbon.appdata.xml) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/vnd.oasis.opendocument.graphics) \
mimehandler(application/x-karbon) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/x-eps) \
mimehandler(image/x-wmf) \
mimehandler(image/x-xfig)"
RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libflake.so.17()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkomain.so.17()(64bit) \
libkoodf.so.17()(64bit) \
libkopageapp.so.17()(64bit) \
libkoplugin.so.17()(64bit) \
libkostore.so.17()(64bit) \
libkovectorimage.so.17()(64bit) \
libkowidgets.so.17()(64bit) \
libkowidgetutils.so.17()(64bit) \
libkundo2.so.17()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpigmentcms.so.17()(64bit) \
libpoppler.so.128()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwpg-0.3.so.3()(64bit) \
pstoedit"

inherit rpm
