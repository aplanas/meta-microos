SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "This package includes the LuaJIT development files. \
LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "texlive-texluajit-devel-2.1.0beta3-93.2.aarch64.rpm"
RPM_HASH = "b2b321b6b84b675fb0df79caa8b52871119fb36a0b9698919228ad87eb14c60cb2ee8ab387f04d26b034171dce4c121bf3d84164a46143cbbb7559e726a54bff"

RPROVIDES:${PN} += "pkgconfig-texluajit \
texlive-texluajit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
