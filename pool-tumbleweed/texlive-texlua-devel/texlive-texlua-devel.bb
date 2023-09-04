SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "This package includes the luatex development files. \
LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "texlive-texlua-devel-5.3.6-93.2.aarch64.rpm"
RPM_HASH = "0d346e3503c843b177416d0e31afda4623d5abf23b7928f5588f662b6c39a9617445049ecf6aaf1f21276a428bb591ab72679d1f12ac4463472d3cd13b1b3b3f"

RPROVIDES:${PN} += "pkgconfig-texlua53 \
texlive-texlua-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
