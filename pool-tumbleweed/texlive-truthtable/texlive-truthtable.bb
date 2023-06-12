SUMMARY = "Automatically generate truth tables for given variables and statements"
DESCRIPTION = "This LuaLaTeX package permits to automatically generate truth \
tables given a table header. It supports a number of logical \
operations which can be combined as needed. It is built upon \
the luacode package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn60717"

RPM_NAME = "texlive-truthtable-2023.201.0.0.0.2svn60717-52.1.noarch.rpm"
RPM_HASH = "66cdd5f11920c73868196f228ba5dd6644bbe2481533c7f62c01b0aab251bf0ec7b7491c27a2b6788e1c7d4e043619f45970436746428524547a070bbf2a55de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(truthtable.sty) \
texlive-truthtable"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luacode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
