SUMMARY = "XML Editor Shared Libraries"
DESCRIPTION = "QXmlEdit is a XML editor written in Qt. It uses a tree-based \
interface to ease the edit of long files. \
 \
This package includes QXmlEdit shared libraries."
LICENSE = "LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "0.9.17"

RPM_NAME = "libqxmledit-0_9_17-0-0.9.17-1.5.aarch64.rpm"
RPM_HASH = "a520e5260c950d1b89537dfda61c60e19b16b72c8abcc72c23b364e1fe82b0a877a7b2edd1d83a20ac7fb9fc4696d595bec4fda288a1d421067b638aa12f72d5"

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
