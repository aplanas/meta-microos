SUMMARY = "XML Editor and XSD Viewer"
DESCRIPTION = "QXmlEdit is a XML editor written in Qt. Its main features are \
unusual data visualization modes, nice XML manipulation and presentation and \
it is multi platform. It can split very big XML files into fragments, and \
compare XML files. It can also few XSD files. \
 \
* Hierarchical customizable view of XML elements. \
* XML hierarchy navigation. \
* Splitting of big XML files. \
* Search supporting XPath expressions. \
* Base64 data handling. \
* Custom visualization styles. \
* XML Schema (XSD) viewer. \
* Columnar view. \
* Sessions handling. \
* Graphical XML file view. \
* Map view of an XML document. \
* Split and fragment extraction of big XML files. \
* Visual compare of XML Schema files. \
* Visual compare of XML files. \
* XML Snippets. \
* XSL specialized mode. \
* Element display via user customizable rules."
LICENSE = "LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "0.9.17"

RPM_NAME = "qxmledit-0.9.17-1.5.aarch64.rpm"
RPM_HASH = "523d08c8348fbe2a04398d4eb39c5cfca462d7649cadeafb198a574f1b9f8478c1cbde79d51284d59d1d1d7d77697f77b6bc068c0467f5d1f3c21fb5c14f9cb9"

RPROVIDES:${PN} += "application() \
application(QXmlEdit.desktop) \
metainfo() \
metainfo(QXmlEdit.appdata.xml) \
mimehandler(text/xml) \
qxmledit \
qxmledit(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQXmlEditSessions.so.0()(64bit) \
libQXmlEditWidget.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Scxml.so.5()(64bit) \
libQt5Scxml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
