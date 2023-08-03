SUMMARY = "Horizontal flipping of pages with pdfLaTeX"
DESCRIPTION = "The package allows the production of a document with pages \
'mirrored'. This is sometimes required by publishers who want \
camera-ready documents to be printed on transparent film (to be \
viewed from the 'wrong' side). The package only works with \
pdfLaTeX or LuaLaTeX in PDF output mode. Package everypage is \
required on LaTeX releases before Fall 2020."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn56782"

RPM_NAME = "texlive-flippdf-2023.209.2.0bsvn56782-53.1.noarch.rpm"
RPM_HASH = "bb04ad2fd860b102aa7258cccb6aad1e605105fc49499b752893da552abdd95ff026671daadf2671e6a54d86c6c1ef0969093e135fd2b6ca50627dc5fe2bf2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flippdf-1x.sty \
tex-flippdf.sty \
texlive-flippdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
