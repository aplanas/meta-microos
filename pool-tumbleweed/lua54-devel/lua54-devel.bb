SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "lua54-devel-5.4.6-1.2.aarch64.rpm"
RPM_HASH = "704294209cb08573ef714b5dc01d615634dcd3b0d15c6df5fb325919857e3011493a7c767a0b6d4f77796a1a89bfd8d69fb4cf8dcba8512eb6ec24dd18608942"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua54-devel \
pkgconfig-lua \
pkgconfig-lua5.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblua5-4-5 \
lua-macros \
lua54 \
update-alternatives"

inherit rpm
