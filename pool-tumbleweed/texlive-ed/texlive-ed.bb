SUMMARY = "Editorial Notes for LaTeX documents"
DESCRIPTION = "This package defines a couple of editorial notes that simplify \
collaboration on a LaTeX text. These allow authors to annotate \
status information in the source. In draft mode, the \
annotations are shown for communication, and in publication \
mode these are suppressed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn25231"

RPM_NAME = "texlive-ed-2023.201.1.8svn25231-53.2.noarch.rpm"
RPM_HASH = "52c1efb10d57e8df1d57a062b0690100a81d335dcb2d29d745839b5ee86a946c8d2620caf8eabc860f226a3bf4009e3ecf432c86bec632972061aeda76a68439"
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
