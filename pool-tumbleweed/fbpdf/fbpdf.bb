SUMMARY = "PDF viewer for Linux framebuffer devices"
DESCRIPTION = "This is a PDF viewer for Linux framebuffer devices. It uses the poppler \
library for rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14"

RPM_NAME = "fbpdf-2.14-4.2.aarch64.rpm"
RPM_HASH = "7665faf292282b6fb99eb6bf7e69cd89ffd42d39138e2ba98f31240667f7c2a2aa389a546741c8e11c9142715f70626b9dcd4ed16eb4a6bafad19f676cdc10ce"

RPROVIDES:${PN} += "fbpdf"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libpoppler-glib.so.8"

inherit rpm
