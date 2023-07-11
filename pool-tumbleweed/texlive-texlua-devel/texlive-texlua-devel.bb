SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "This package includes the luatex development files. \
LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "texlive-texlua-devel-5.3.6-92.1.aarch64.rpm"
RPM_HASH = "cc5ca74df9a840cf2593ff195b9ae350b13a233930b8cf10498544a1766cb45c6604c957f7b1388cef0007d41981b3543eedc68045e6083293a35492ea2cecf7"

RPROVIDES:${PN} += "pkgconfig-texlua53 \
texlive-texlua-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
