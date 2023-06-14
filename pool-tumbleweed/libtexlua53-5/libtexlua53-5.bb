SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libtexlua53-5-5.3.6-91.1.aarch64.rpm"
RPM_HASH = "357ea5db94a2f31deedfa3638f75476a89ee93370423af534a6ccee880954dc08675c56dd53bb71996b5a6b33076837966529aa54423e17b07889c7fe4205fa9"

RPROVIDES:${PN} += "libtexlua53-5 \
libtexlua53.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
