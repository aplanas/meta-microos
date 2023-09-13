SUMMARY = "Building blocks for modern GNOME applications"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the shared library for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.5"

RPM_NAME = "libadwaita-1-0-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "96eed0d67b3be5e252959b40bcb03877f7053b73d40bb24687df3096d6b754f21d48afab3aa220e98a69cbdc8bde464b07f23a570638bb8a213b4ac78a36e693"

RPROVIDES:${PN} += "libadwaita \
libadwaita-1-0 \
libadwaita-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
