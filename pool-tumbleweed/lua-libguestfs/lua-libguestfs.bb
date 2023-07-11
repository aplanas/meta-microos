SUMMARY = "Lua bindings for libguestfs"
DESCRIPTION = "lua-libguestfs contains Lua bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "lua-libguestfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "c5ef7827b33d26e94aa7e839eebc51ac226498ab7c3f5f01fbe96f1bd076af66b52a92b719bc1756ff9052f6ed2436870940b61317a3b8e74b3e09836735dea0"

RPROVIDES:${PN} += "libluaguestfs.so \
lua-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
lua"

inherit rpm
