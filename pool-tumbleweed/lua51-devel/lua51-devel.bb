SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.1.5"

RPM_NAME = "lua51-devel-5.1.5-15.16.aarch64.rpm"
RPM_HASH = "a9eedc2023f9f8f8c269ee59eaf788f2d433b8ebe59f07a47286a71b340dba98467b17af9e6b6678838cb39043799cef048b34a853ad8e2c8672a5ec2b095125"

RPROVIDES:${PN} += "Lua(devel) \
lua-devel \
lua51-devel \
lua51-devel(aarch-64) \
pkgconfig(lua) \
pkgconfig(lua5.1)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
liblua5_1-5 \
lua-macros \
lua51 \
update-alternatives"

inherit rpm
