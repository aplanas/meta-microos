SUMMARY = "PDF viewer for Linux framebuffer devices"
DESCRIPTION = "This is a PDF viewer for Linux framebuffer devices. It uses the poppler \
library for rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14"

RPM_NAME = "fbpdf-2.14-4.1.aarch64.rpm"
RPM_HASH = "cf5b651bd8320ef41c198ee9cbf30c8aaa5bf3b4d71a5ae510e685fd0271067767d0bdcc27c8cd5994050b03d7be66e10bb728224c4f1676978f2e42aaba8204"

RPROVIDES:${PN} += "fbpdf"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libpoppler-glib.so.8"

inherit rpm
