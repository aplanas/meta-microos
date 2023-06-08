SUMMARY = "PDF viewer for Linux framebuffer devices"
DESCRIPTION = "This is a PDF viewer for Linux framebuffer devices. It uses the poppler \
library for rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14"

RPM_NAME = "fbpdf-2.14-4.1.aarch64.rpm"
RPM_HASH = "cf5b651bd8320ef41c198ee9cbf30c8aaa5bf3b4d71a5ae510e685fd0271067767d0bdcc27c8cd5994050b03d7be66e10bb728224c4f1676978f2e42aaba8204"

RPROVIDES:${PN} += "fbpdf fbpdf(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdrm.so.2()(64bit) libepoxy.so.0()(64bit) libgbm.so.1()(64bit) libpoppler-glib.so.8()(64bit)"

inherit rpm
