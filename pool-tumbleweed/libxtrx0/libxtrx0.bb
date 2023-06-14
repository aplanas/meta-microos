SUMMARY = "High level XTRX API"
DESCRIPTION = "High level API for XTRX software defined radio frontends."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrx0-0.0.0+git.20201202-3.7.aarch64.rpm"
RPM_HASH = "6b308c0df0500eb464243cd11777ebf285c6660c929c0af88c68838b15d7bdb57a78c9ca1894f5f54130854be3b1166bfe8c0eea6dbc5890978f9df4a7eee5be"

RPROVIDES:${PN} += "libxtrx.so.0 \
libxtrx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblms7compact.so.0 \
libxtrxdsp.so.0 \
libxtrxll.so.0"

inherit rpm
