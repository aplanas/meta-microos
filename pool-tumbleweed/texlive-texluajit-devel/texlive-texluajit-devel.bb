SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "This package includes the LuaJIT development files. \
LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "texlive-texluajit-devel-2.1.0beta3-93.1.aarch64.rpm"
RPM_HASH = "c866ee8709c75803f02c27fa32f89a510d39926d904d04e8c18fbc01be10ed71d74fecc2ac88115ee16517db885aa81d64eda985ef532d5f13b7ae6de696cd4a"

RPROVIDES:${PN} += "pkgconfig-texluajit \
texlive-texluajit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
