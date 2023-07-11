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

RPM_NAME = "qpdfview-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "0d043702b8e6ded960cd00c4e1360660aeea941f94e64a23208a86f5fb0400a9f83e7c331c51eebd578746a0e5145d063fa191f2e080e721bd72c551ba193a19"

RPROVIDES:${PN} += "qpdfview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libqt5-sql-backend \
libstdc++.so.6 \
libz.so.1 \
qpdfview-plugin-pdf"

inherit rpm
