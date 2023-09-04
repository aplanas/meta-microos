SUMMARY = "Lua bindings for genders"
DESCRIPTION = "Necessary files for using genders with lua."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "lua-genders-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "0ecd06a69e7a0385b9fb61b73bb6d02027a6f6023592074901ff3825461df96738af845121091add7ef54f3b6748aab8b10560788d2f8475682067b53f8cc6fd"

RPROVIDES:${PN} += "lua-genders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
