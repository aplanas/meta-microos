SUMMARY = "KDE CHM and ePub Viewer"
DESCRIPTION = "This is a viewer for ebooks and documentation in CHM (Microsoft Compiled HTML) and ePub formats. \
It supports complex searching for large books and has various viewing features."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "kchmviewer-8.0-3.2.aarch64.rpm"
RPM_HASH = "796f59c0016cc359dd22f1491fb5ed5515cde02b191028012f3968c543a55786c952e11726289c99c14c7d1fdd4332ec882177406461fb51a4a3921e2d67c5f9"

RPROVIDES:${PN} += "kchmviewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libchm.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
