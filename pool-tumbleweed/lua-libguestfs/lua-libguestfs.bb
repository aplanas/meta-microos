SUMMARY = "Lua bindings for libguestfs"
DESCRIPTION = "lua-libguestfs contains Lua bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "lua-libguestfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "2107302652837e542534516434c96f502f4e45a9bbcdc18b78729de113d263ab27f1e5b10c82dbfd97282b8e2deeb094e8a39223127255579689524e6c71e73c"

RPROVIDES:${PN} += "libluaguestfs.so \
lua-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
lua"

inherit rpm
