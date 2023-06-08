SUMMARY = "The deepin Document Viewer"
DESCRIPTION = "deepin-reader is a small, fast and full-featured tool for viewing documents, \
supporting PDF and DJVU formats, multi-window and multi-tab management,thumbnail \
viewing, adding bookmarks and notes, magnifying, slide show,searching texts, \
rotation, etc."
LICENSE = "GPL-3.0+"

PV = "5.10.23"

RPM_NAME = "deepin-reader-5.10.23-1.4.aarch64.rpm"
RPM_HASH = "e239a1e1982e9ad3aec310e335472c5e50340972dd46fcd5b082389cdc10c0a8b96493f8cf9e75abcbba4fd277d500982decfc23086b974a44fe5ff24a7fbf50"

RPROVIDES:${PN} += "application() application(deepin-reader.desktop) deepin-reader deepin-reader(aarch-64) mimehandler(application/pdf) mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.document) mimehandler(application/wps-office.docx) mimehandler(image/vnd.djvu) mimehandler(image/vnd.djvu+multipage)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdeepin-pdfium.so.1()(64bit) libdjvulibre.so.21()(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
