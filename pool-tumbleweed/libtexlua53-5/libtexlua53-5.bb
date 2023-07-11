SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libtexlua53-5-5.3.6-92.1.aarch64.rpm"
RPM_HASH = "017e762b6d5b3227d20ba7a87a7301d32f905969762fedae4979597489b8ba751b9dd861a6a0e75708562b1e5321f75e4efb144671754d2d6226980e3bebc7c8"

RPROVIDES:${PN} += "libtexlua53-5 \
libtexlua53.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
