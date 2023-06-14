SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua51-lgi-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "c830c3d19bde4a9a42762d76413fbaae9863bf444d049291e6b19b5f7229dbaaf78e93a76c35729cca85c9ba82d64968222b0bc4d5369ff0e698ebdaf50274e8"

RPROVIDES:${PN} += "lua51-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
lua51"

inherit rpm
