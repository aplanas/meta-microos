SUMMARY = "Editorial Notes for LaTeX documents"
DESCRIPTION = "This package defines a couple of editorial notes that simplify \
collaboration on a LaTeX text. These allow authors to annotate \
status information in the source. In draft mode, the \
annotations are shown for communication, and in publication \
mode these are suppressed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn25231"

RPM_NAME = "texlive-ed-2023.201.1.8svn25231-53.1.noarch.rpm"
RPM_HASH = "3eba3595bb7e74acc9f352c9d2b225de8f6aa2e245231facac8b51b2bf908b1f09e0c6d5cc13c0495dae1b29ae706033d21e0f567054b320d96a4d6fefed2f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ed.sty) \
texlive-ed"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(paralist.sty) \
tex(verbatim.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
