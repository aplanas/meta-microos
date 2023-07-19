SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libtexlua53-5-5.3.6-93.1.aarch64.rpm"
RPM_HASH = "1870808514d352bc07e614dfad13d8459443e3101cd81368465032b4b1ef508c621267e9a3efc77104384a89ee8bdf8c05828d7e51a642025508fca1e76a158c"

RPROVIDES:${PN} += "libtexlua53-5 \
libtexlua53.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
