SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua53-lgi-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "923f7073c531f6f30356d059935fcfe1526bd9ef135291742ad839b9abf6c7d69e5cc991688532f3d538cbbd665e45d89ff4e083e1debc2e9c4a5343758a73a6"

RPROVIDES:${PN} += "lua53-lgi \
lua53-lgi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
lua53"

inherit rpm
