SUMMARY = "Editorial Notes for LaTeX documents"
DESCRIPTION = "This package defines a couple of editorial notes that simplify \
collaboration on a LaTeX text. These allow authors to annotate \
status information in the source. In draft mode, the \
annotations are shown for communication, and in publication \
mode these are suppressed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn25231"

RPM_NAME = "texlive-ed-2023.209.1.8svn25231-54.1.noarch.rpm"
RPM_HASH = "5857b79d9e4b26891a68544550281d14a82f4c1662cffb590681d41c03d6abb12cd0fe881f76cba9c6cd4b0268a44a8b684a4efcabbd36045f044a1b4f6d6788"
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
