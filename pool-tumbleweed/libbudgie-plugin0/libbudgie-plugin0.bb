SUMMARY = "Shared library for Budgie plugins"
DESCRIPTION = "Shared library for budgie plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "libbudgie-plugin0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "f88ed55fefa2f0b83db363e5b41ac8feac5b0c40f31d2f675d4e30d3003b7248b155d9f46d129fcb68beefa0cc24e14f6ca1027f805bb7bc458e658b49b8b05e"

RPROVIDES:${PN} += "libbudgie-plugin.so.0 \
libbudgie-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
