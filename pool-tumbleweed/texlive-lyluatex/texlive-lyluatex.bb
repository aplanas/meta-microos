SUMMARY = "Commands to include lilypond scores within a (Lua)LaTeX document"
DESCRIPTION = "This package provides macros for the inclusion of LilyPond \
scores within LuaLaTeX. It calls LilyPond to compile scores, \
then includes the produced files. Dependencies: currfile, \
environ, graphicx, luaotfload, luaoptions, luatexbase, \
metalogo, minibox, pdfpages, xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn66278"

RPM_NAME = "texlive-lyluatex-2023.201.1.1.3svn66278-52.1.noarch.rpm"
RPM_HASH = "402b5934da1f0998f8f15d28c5ddc1ad86232d7d9679fc77763ab45fb58d4e72a76ba3f721eb455cea4e3d3f607e95cfc31c1e2d4c12ecbc767cedc504f58c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lyluatex.sty) \
texlive-lyluatex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
coreutils \
ed \
findutils \
grep \
sed \
tex(currfile.sty) \
tex(environ.sty) \
tex(graphicx.sty) \
tex(luaoptions.sty) \
tex(metalogo.sty) \
tex(minibox.sty) \
tex(pdfpages.sty) \
tex(varwidth.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
