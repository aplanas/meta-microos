SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "lua53-devel-5.3.6-2.4.aarch64.rpm"
RPM_HASH = "ed26825b5638fbb2e0f80bfe6c640ae9c7b7a551416a66657639fcdda3517da2202eb287cd4acd366290ecdd4996fe0085278f33a465a43d197d6eb45ce56452"

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
