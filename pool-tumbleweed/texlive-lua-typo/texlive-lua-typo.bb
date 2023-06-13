SUMMARY = "Highlighting typographical flaws with LuaLaTeX"
DESCRIPTION = "This package tracks common typographic flaws in LuaLaTeX \
documents, especially widows, orphans, hyphenated words split \
over two pages, consecutive lines ending with hyphens, \
paragraphs ending on too short lines, etc. Customisable colours \
are used to highlight these flaws, and the list of pages on \
which typographical flaws were found is printed."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.65svn66513"

RPM_NAME = "texlive-lua-typo-2023.201.0.0.65svn66513-52.1.noarch.rpm"
RPM_HASH = "8ae1fff2acea2fda7aba3af2831ba95b623551ff3038c656abb5576a80f9e44343e1db43211161bc936449de38407ee09945f874eccc679f0907ca4345385e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lua-typo-2021-04-18.sty) \
tex(lua-typo.cfg) \
tex(lua-typo.sty) \
texlive-lua-typo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atveryend.sty) \
tex(kvoptions.sty) \
tex(luacode.sty) \
tex(luacolor.sty) \
tex(luatexbase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
