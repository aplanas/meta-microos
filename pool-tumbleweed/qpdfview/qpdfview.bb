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

RPM_NAME = "qpdfview-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "126337de0278f24b1fc73e3bc03e9948ea87bcead49965344efa7b63cb2d50ffb63c3929dcc6a59dda27e21259cb6f04d6cef67256ef12efda5ab8f11f0b92fc"

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
