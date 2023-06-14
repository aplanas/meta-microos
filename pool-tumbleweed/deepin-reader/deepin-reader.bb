SUMMARY = "The deepin Document Viewer"
DESCRIPTION = "deepin-reader is a small, fast and full-featured tool for viewing documents, \
supporting PDF and DJVU formats, multi-window and multi-tab management,thumbnail \
viewing, adding bookmarks and notes, magnifying, slide show,searching texts, \
rotation, etc."
LICENSE = "GPL-3.0+"

PV = "5.10.23"

RPM_NAME = "deepin-reader-5.10.23-1.5.aarch64.rpm"
RPM_HASH = "bf86c085a7d37fc3fc08329f53c4004bc68f48462466fc87edb55874181f84c046f4e05c76afc1c9812b704c90bddeeacb3a913be1c397061941950ca6e9dd3a"

RPROVIDES:${PN} += "deepin-reader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdeepin-pdfium.so.1 \
libdjvulibre.so.21 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
