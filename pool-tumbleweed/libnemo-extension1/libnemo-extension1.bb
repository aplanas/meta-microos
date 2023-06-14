SUMMARY = "Nemo extension shared libraries"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides Nemo's shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "libnemo-extension1-5.6.4-1.2.aarch64.rpm"
RPM_HASH = "fe0c4495c756dee44576b5c2b3f3e76645121a7a1a91bc08d1b3727ee5c49aeac958cdd597603fa4a3f23d009920f45b560ebf6325285b7a2c5902476583ca14"

RPROVIDES:${PN} += "libnemo-extension.so.1 \
libnemo-extension1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
