SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "This package includes the LuaJIT development files. \
LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "texlive-texluajit-devel-2.1.0beta3-92.1.aarch64.rpm"
RPM_HASH = "a2f3a26e1d47287db683d6feb2f7c649e0b320df4aa0b22036eeefc06c00f2204342fa21aed17c380bf2222cd50c7328781c5cfb0b43e88112975373f2709715"

RPROVIDES:${PN} += "pkgconfig-texluajit \
texlive-texluajit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
