SUMMARY = "Nemo extension shared libraries"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides Nemo's shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "libnemo-extension1-5.6.4-1.3.aarch64.rpm"
RPM_HASH = "9d0d3ae399e1aa3b06f3dc16d49c108aeb0c2de3bd5c5f8f4872f65fa52019f23a7bc39f959ffeeaca182f74801b3f5c217259840d68074f27aa52e7e46b3471"

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
