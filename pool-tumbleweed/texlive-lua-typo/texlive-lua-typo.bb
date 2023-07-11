SUMMARY = "Highlighting typographical flaws with LuaLaTeX"
DESCRIPTION = "This package tracks common typographic flaws in LuaLaTeX \
documents, especially widows, orphans, hyphenated words split \
over two pages, consecutive lines ending with hyphens, \
paragraphs ending on too short lines, etc. Customisable colours \
are used to highlight these flaws, and the list of pages on \
which typographical flaws were found is printed."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.65svn66513"

RPM_NAME = "texlive-lua-typo-2023.208.0.0.65svn66513-53.1.noarch.rpm"
RPM_HASH = "ba7a5dc240b64eaa5631a86eed165adbdb1320a650e1b07217c7340e8f7507b63e0beb99c8105cbd08a0d5e12d6255190b02e7115739e3ac10f104b02f5f8d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-typo-2021-04-18.sty \
tex-lua-typo.cfg \
tex-lua-typo.sty \
texlive-lua-typo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luacolor.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
