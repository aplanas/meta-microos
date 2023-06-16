SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "lua53-devel-5.3.6-2.3.aarch64.rpm"
RPM_HASH = "c96d1ab83ec3b09734b759254aef8c389265cab6e64c1660e5ad46323f4c29b773a32b21638765b31920b4490f7428bd4941f5b3bd6c63c99120708dba14716b"

RPROVIDES:${PN} += "Lua-devel \
lua-devel \
lua53-devel \
pkgconfig-lua \
pkgconfig-lua5.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblua5-3-5 \
lua-macros \
lua53 \
update-alternatives"

inherit rpm
