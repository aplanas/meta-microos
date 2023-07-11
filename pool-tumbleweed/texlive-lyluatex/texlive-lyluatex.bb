SUMMARY = "Commands to include lilypond scores within a (Lua)LaTeX document"
DESCRIPTION = "This package provides macros for the inclusion of LilyPond \
scores within LuaLaTeX. It calls LilyPond to compile scores, \
then includes the produced files. Dependencies: currfile, \
environ, graphicx, luaotfload, luaoptions, luatexbase, \
metalogo, minibox, pdfpages, xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1.3svn66278"

RPM_NAME = "texlive-lyluatex-2023.208.1.1.3svn66278-53.1.noarch.rpm"
RPM_HASH = "b57a8427556c1771e1e848564d1ad1538caff238b00e52f780312f116af6c3379874f1822b198c6d12b6add9839861f1b154debeddd0140b897a7464eed18517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lyluatex.sty \
texlive-lyluatex"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-luaoptions.sty \
tex-metalogo.sty \
tex-minibox.sty \
tex-pdfpages.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
