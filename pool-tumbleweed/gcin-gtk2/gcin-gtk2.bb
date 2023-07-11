SUMMARY = "Gcin gtk2 immodule"
DESCRIPTION = "gcin gtk2 immodule, support gtk2-based applications"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-gtk2-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "bad629521e86874748bab4880216643561ce5e72f1b36fcae343f6fc61bc98b3b2b59d71523db5e787566210878eb5d44138c35c554ff9bc230913cc0452c48c"

RPROVIDES:${PN} += "gcin-gtk2 \
gcin-gtk2-immodule"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin \
gtk2-tools \
libc.so.6 \
libgcin-im-client.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
