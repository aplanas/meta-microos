SUMMARY = "Application to Design Electric Diagrams"
DESCRIPTION = "QElectroTech is a Qt5 application to design electric diagrams. It uses XML \
files for elements and diagrams, and includes both a diagram editor and an \
element editor."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.90"

RPM_NAME = "qelectrotech-0.90-1.1.aarch64.rpm"
RPM_HASH = "71b17b5a42f6ea9499b57dd3d62f66a7cdb2fa2f5ebbd2a9252c9d135b43c26e22913c285c1c5077f9c21b7ba2b0c1b9a7c2aadaa37bca2bc4972f5ee6407ba0"

RPROVIDES:${PN} += "application() \
application(qelectrotech.desktop) \
metainfo() \
metainfo(qelectrotech.appdata.xml) \
mimehandler(application/x-qet-element) \
mimehandler(application/x-qet-project) \
mimehandler(application/x-qet-titleblock) \
qelectrotech \
qelectrotech(aarch-64)"

RDEPENDS:${PN} += "libKF5CoreAddons.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
