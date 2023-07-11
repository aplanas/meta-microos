SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua51-lgi-0.9.2-4.4.aarch64.rpm"
RPM_HASH = "a25fd9309a58ed6cbd44414d15aee7e521aabb0b8f8d5301def9cee8836796c41d422d7af8a96741754f1e7cbf178cc7c7fbbfcf2eccf1e908401ad7e9f850b7"

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
