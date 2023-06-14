SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "libxreaderdocument3-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "d4c793120505a33212829a4ebb1733963335646179c213f08e4f6e59502eb878c480a3747c43ccaba9872314849291d4ea40b3f5902726a43b484f8572de1fbd"

RPROVIDES:${PN} += "libxreaderdocument.so.3 \
libxreaderdocument3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
