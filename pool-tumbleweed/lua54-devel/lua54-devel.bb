SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "lua54-devel-5.4.6-1.1.aarch64.rpm"
RPM_HASH = "b1eeed5376da444c5f68e05a164d7527238608ab8a358ec952e0c02fbccca321442b80ce5c5e8dab7d57814a363c41d78af9b84e1d861323c637230be5d1cd0d"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua54-devel \
pkgconfig-lua \
pkgconfig-lua5.4"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
liblua5-4-5 \
lua-macros \
lua54 \
update-alternatives"

inherit rpm
