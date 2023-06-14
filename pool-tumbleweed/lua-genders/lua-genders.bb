SUMMARY = "Lua bindings for genders"
DESCRIPTION = "Necessary files for using genders with lua."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "lua-genders-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "ed65c1f253a36d87daa6d319e88af55b13615a48373147035a878a8103cb5942dd37a502e9ca4b4c11c246d7aba48a84e86895a69e81192c4d03841512013bb2"

RPROVIDES:${PN} += "lua-genders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
