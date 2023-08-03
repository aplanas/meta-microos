SUMMARY = "A basic LuaTeX OpenType handler"
DESCRIPTION = "This is a basic LuaTeX OpenType handler, based on Paul \
Isambert's PiTeX code. It should work with Plain TeX at least."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn65441"

RPM_NAME = "texlive-blopentype-2023.209.0.0.0.0svn65441-53.1.noarch.rpm"
RPM_HASH = "a32eb0af91c9dc2dab460cccb8db3f0bfe003f56e38b906972eae983051c07797cb82c9181c7da8eb7b5de37d922168b9830980242b4c41d2dd8e7aa7eb64fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blot-files.tex \
tex-blot-fonts.tex \
tex-blot-lua.tex \
tex-blot.tex \
texlive-blopentype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gates \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texapi \
texlive-yax"

inherit rpm
