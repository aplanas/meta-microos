SUMMARY = "Lua bindings for libguestfs"
DESCRIPTION = "lua-libguestfs contains Lua bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "lua-libguestfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "0d6f9b818503666581eb5b8de8f6fa0c310926fd5e1324a6b8e240388dc4cae2eb7304dc6c10f5ea12022d51838adf7e57983ce42802a038bb9578e2e5d620f4"

RPROVIDES:${PN} += "libluaguestfs.so \
lua-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
lua"

inherit rpm
