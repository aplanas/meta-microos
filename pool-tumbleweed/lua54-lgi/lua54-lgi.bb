SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua54-lgi-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "025e8fbe23da440abd2f05086d6d81508fd219b1cbbc08cce6f14c2607bbd544fcf1923f91cab51e236be7af4977bf1ad282a862ee8264de2908adea2ecb82f2"

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
