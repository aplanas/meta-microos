SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua53-lgi-0.9.2-4.4.aarch64.rpm"
RPM_HASH = "9a16a7043e115e5d3f24521051335ce33605a6c456ba40df74df1f9dd0c6ec78de3ec04fe66ab5133b5b8322e59e3d3f904306a132687c71c6343f488b41c2c7"

RPROVIDES:${PN} += "lua53-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
lua53"

inherit rpm
