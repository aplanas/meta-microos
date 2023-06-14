SUMMARY = "Application to Design Electric Diagrams"
DESCRIPTION = "QElectroTech is a Qt5 application to design electric diagrams. It uses XML \
files for elements and diagrams, and includes both a diagram editor and an \
element editor."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.90"

RPM_NAME = "qelectrotech-0.90-1.1.aarch64.rpm"
RPM_HASH = "71b17b5a42f6ea9499b57dd3d62f66a7cdb2fa2f5ebbd2a9252c9d135b43c26e22913c285c1c5077f9c21b7ba2b0c1b9a7c2aadaa37bca2bc4972f5ee6407ba0"

RPROVIDES:${PN} += "qelectrotech"

RDEPENDS:${PN} += "libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
