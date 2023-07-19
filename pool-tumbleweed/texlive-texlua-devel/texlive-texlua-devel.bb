SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "This package includes the luatex development files. \
LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "texlive-texlua-devel-5.3.6-93.1.aarch64.rpm"
RPM_HASH = "77dbd65dc8e2855dcabd4c8f030adb332447583c51e1d0ac8a62bf8007884e829785ed3e333de5f15818a9b5c969becb669817ce4f2922c5f928c2a3677f8131"

RPROVIDES:${PN} += "pkgconfig-texlua53 \
texlive-texlua-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
