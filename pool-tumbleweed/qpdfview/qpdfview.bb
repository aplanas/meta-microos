SUMMARY = "Tabbed document viewer in Qt"
DESCRIPTION = "qpdfview uses Poppler for PDF support, libspectre for PS support, \
DjVuLibre for DjVu support, CUPS for printing support and the Qt \
toolkit for its interface. \
 \
Current features include: \
 * Outline, properties and thumbnail panes. \
 * Scale, rotate and fit. \
 * Fullscreen and presentation views. \
 * Continuous and multiple-page layouts. \
 * Search for text. \
 * Configurable tool bars. \
 * Configurable keyboard shortcuts. \
 * Persistent per-file settings. \
 * SyncTeX support. \
 * Rudimentary annotation support. \
 * Rudimentary form support. \
 * Support for PostScript and DjVu documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "4b258b4032321c56e287cd46f5e779fefbdc03213cae0776a7c43998fca91213205848d539c7aa00f27fe7d314c573e4c249cc0466f2f9695cac9953b134c986"

RPROVIDES:${PN} += "application() \
application(qpdfview.desktop) \
metainfo() \
metainfo(qpdfview.appdata.xml) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/x-pdf) \
mimehandler(image/pdf) \
mimehandler(image/vnd.djvu) \
mimehandler(image/x-djvu) \
mimehandler(image/x-pdf) \
mimehandler(text/pdf) \
mimehandler(text/x-pdf) \
qpdfview \
qpdfview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcups.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqt5_sql_backend \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit) \
qpdfview-plugin-pdf"

inherit rpm
