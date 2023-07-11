SUMMARY = "Simple text viewer"
DESCRIPTION = "Basic utility that just displays plain text files."
LICENSE = "GPL-3.0+"

PV = "0.1.4"

RPM_NAME = "clack-0.1.4-1.29.aarch64.rpm"
RPM_HASH = "b5546970f270d87f22f1b0d88456a0ce9980a6f03545fd5968ebc858943b867357d3321b4f2c88e2e3fd24349d1cc852084442ee0a2492f2b57a63a3fb79c90a"

RPROVIDES:${PN} += "clack"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1"

inherit rpm
