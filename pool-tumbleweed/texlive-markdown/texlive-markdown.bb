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

PV = "2023.201.2.21.0_0_gee15b88svn66257"

RPM_NAME = "texlive-markdown-2023.201.2.21.0_0_gee15b88svn66257-52.1.noarch.rpm"
RPM_HASH = "67eb4d1f1eac591a34b6130166ae0ecbe1c4ea21b656c49990c9cd128a49b0428d9dea66a1ee77a416239829887ef5d70443e65eb9410cee8650cd29f469478f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-markdown.sty \
tex-markdown.tex \
tex-markdownthemewitiko-dot.sty \
tex-markdownthemewitiko-graphicx-http.sty \
tex-markdownthemewitiko-tilde.sty \
tex-t-markdown.tex \
texlive-markdown"

RDEPENDS:${PN} += "/bin/sh \
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
