SUMMARY = "A program for statistical analysis of sampled data"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
PSPP development is ongoing. It already supports a large subset of \
SPSS's syntax. Its statistical procedure support is currently \
limited, but growing. At your option, PSPP will produce statistical \
reports in ASCII, PostScript, PDF, HTML, SVG, or OpenDocument formats."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-1.4.1-3.12.aarch64.rpm"
RPM_HASH = "72aacf0fb5178a970e7343d007caf4b388e67d024a6dfb659d276a4bc272053b3b13ffabb2d1797611dd6d7c8172ca35b8c5b8e9102ff8b3e32010769a0a3989"

RPROVIDES:${PN} += "application() \
application(org.fsf.pspp.desktop) \
config(pspp) \
libpspp-1.4.1.so()(64bit) \
libpspp-core-1.4.1.so()(64bit) \
metainfo() \
metainfo(org.fsf.pspp.metainfo.xml) \
mimehandler(application/x-spss-por) \
mimehandler(application/x-spss-sav) \
mimehandler(application/x-spss-sps) \
mimehandler(application/x-spss-spv) \
pspp \
pspp(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libharfbuzz.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libreadline.so.8()(64bit) \
libspread-sheet-widget.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
