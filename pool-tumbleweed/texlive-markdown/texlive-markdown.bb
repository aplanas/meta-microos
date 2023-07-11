SUMMARY = "Converting and rendering markdown documents inside TeX"
DESCRIPTION = "The package provides facilities for the conversion of markdown \
markup to plain TeX. These are provided both in form of a Lua \
module and in form of plain TeX, LaTeX, and ConTeXt macro \
packages that enable the direct inclusion of markdown documents \
inside TeX documents. Architecturally, the package consists of \
the Lunamark Lua module by John MacFarlane, which was slimmed \
down and rewritten for the needs of the package. Lunamark \
provides speedy markdown parsing for the rest of the package. \
On top of Lunamark sits code for the plain TeX, LaTeX, and \
ConTeXt formats by Vit Novotny."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.21.0_0_gee15b88svn66257"

RPM_NAME = "texlive-markdown-2023.208.2.21.0_0_gee15b88svn66257-53.1.noarch.rpm"
RPM_HASH = "40c501fd8121fe42a009e678a18ad2f05b9f0c7594e27304fae9c6b3fc4c518d3477c3a82bf5531f2473630d15d0cbb6857b7d4fb1f827986d7fb435cee9c979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-markdown.sty \
tex-markdown.tex \
tex-markdownthemewitiko-dot.sty \
tex-markdownthemewitiko-graphicx-http.sty \
tex-markdownthemewitiko-tilde.sty \
tex-t-markdown.tex \
texlive-markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-catchfile.sty \
tex-csvsimple.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyvrb.sty \
tex-gobble.sty \
tex-graphicx.sty \
tex-grffile.sty \
tex-ifthen.sty \
tex-ltxcmds.sty \
tex-paralist.sty \
tex-soulutf8.sty \
tex-url.sty \
tex-verse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
