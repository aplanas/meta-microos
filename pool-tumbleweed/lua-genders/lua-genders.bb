SUMMARY = "Lua bindings for genders"
DESCRIPTION = "Necessary files for using genders with lua."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "lua-genders-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "09a389b48aabef90190712033a0c747da4453c0e7f1263a1fab912b836b37dd1498d719a36ae71911ec81cc36a1beb611c69b49236575aec66807247980e511f"

RPROVIDES:${PN} += "lua-genders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
