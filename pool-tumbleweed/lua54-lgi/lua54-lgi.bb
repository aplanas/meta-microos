SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua54-lgi-0.9.2-4.4.aarch64.rpm"
RPM_HASH = "dc98fc7912eaceb9f4aa9e81b3a18eec82a469a6cdaa3dde7c1023696f8aff79eefa5d28d3b7924f8287237777076d5202ed5b6a73d30f2325bc61f6e7b8bb75"

RPROVIDES:${PN} += "lua-lgi \
lua54-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
lua54"

inherit rpm
