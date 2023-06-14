SUMMARY = "Lua bindings for libguestfs"
DESCRIPTION = "lua-libguestfs contains Lua bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "lua-libguestfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "167f577acef6549a2337d3a28e004ea284b698bd4538a2e75bfbd5bd5d38213028c62537c056d49f40c03ddbcd5719b8a5c169b83ff74de21eecdd2eb6be9ded"

RPROVIDES:${PN} += "libluaguestfs.so \
lua-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
lua"

inherit rpm
