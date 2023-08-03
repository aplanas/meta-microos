SUMMARY = "LaTeX laboratory"
DESCRIPTION = "The LaTeX laboratory provides a route for additions to the \
LaTeX kernel to be stablised, whilst still allowing some \
stability for adventorous users."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64892"

RPM_NAME = "texlive-latex-lab-2023.209.svn64892-56.1.noarch.rpm"
RPM_HASH = "f621ef0990a9314b278244799c50761f70956a9ecd8f30bac478bacdcc3b6baafec04d6f4049ca92c0ed9df708aabd0fe1a5e537d157cf9b55c4f4a7870247ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex-lab-testphase-new-or.sty \
texlive-latex-lab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
