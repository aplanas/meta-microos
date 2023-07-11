SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.1.5"

RPM_NAME = "lua51-devel-5.1.5-15.17.aarch64.rpm"
RPM_HASH = "973e464e2a1d8abd896299ad90de08732d831070136953fc1d82be4b34cfbc9997da0104a14d7c72fa2d43d1cddf4df4de3ab20b1e5c33051b3617aa98ef0f02"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua51-devel \
pkgconfig-lua \
pkgconfig-lua5.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblua5-1-5 \
lua-macros \
lua51 \
update-alternatives"

inherit rpm
