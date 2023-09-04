SUMMARY = "Editorial Notes for LaTeX documents"
DESCRIPTION = "This package defines a couple of editorial notes that simplify \
collaboration on a LaTeX text. These allow authors to annotate \
status information in the source. In draft mode, the \
annotations are shown for communication, and in publication \
mode these are suppressed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn25231"

RPM_NAME = "texlive-ed-2023.209.1.8svn25231-54.2.noarch.rpm"
RPM_HASH = "44c70965ca0423a39f057b9ccfd7742b2a4aeddf102079384f01dc1ca8ac24c0b58b88736a1c9354c3b46619a0b1d6d09f82788bd4be27fe3048f7eab1807b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ed.sty \
texlive-ed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paralist.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
