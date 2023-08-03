SUMMARY = "The Lexend fonts for XeLaTeX and LuaLaTeX through fontspec"
DESCRIPTION = "The purpose of this package is pretty straightforward: The \
Lexend font collection has been designed by Dr. Bonnie \
Shaver-Troup and Thomas Jockin to make reading easier for \
everyone. Now my goal is to bring this wonderful collection to \
the world of LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0.70svn57564"

RPM_NAME = "texlive-lexend-2023.209.1.1.0.70svn57564-55.1.noarch.rpm"
RPM_HASH = "8df982302bcf7f7cddd6b9b061d4b76c57f3673796905afe2b52c6f68426fb199f10c9d5d6f2372a466768de6e22266c24e184d843f8d16e3333b713503c623d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lexend.sty \
texlive-lexend"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lexend-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
