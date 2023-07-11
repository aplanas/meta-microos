SUMMARY = "XML Editor Shared Libraries"
DESCRIPTION = "QXmlEdit is a XML editor written in Qt. It uses a tree-based \
interface to ease the edit of long files. \
 \
This package includes QXmlEdit shared libraries."
LICENSE = "LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "0.9.17"

RPM_NAME = "libqxmledit-0_9_17-0-0.9.17-1.6.aarch64.rpm"
RPM_HASH = "d311c9ee08cffa18561e8e12be2c7ab2b34d2ceaa6c9bf240693e25f32e9c50b12da07c0c2bad5b446c0642f673fc5d735eaeb048544b242da9bfab177e1de3e"

RPROVIDES:${PN} += "libQXmlEditSessions.so.0 \
libQXmlEditWidget.so.0 \
libqxmledit-0-9-17-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
