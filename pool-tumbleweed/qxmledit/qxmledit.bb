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

RPM_NAME = "qxmledit-0.9.17-1.6.aarch64.rpm"
RPM_HASH = "0ef2e3fe82ed29ed4c88b69ab1b06f04155eaa0d19d59e910bb063f7739fe3b86229bbecddcdd095f8b6338e706647196aed62d57ac7194278fe3d84fd628f15"

RPROVIDES:${PN} += "qxmledit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQXmlEditSessions.so.0 \
libQXmlEditWidget.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Scxml.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
