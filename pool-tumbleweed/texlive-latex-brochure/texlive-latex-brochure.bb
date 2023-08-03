SUMMARY = "A publicity flyer for LaTeX"
DESCRIPTION = "The document is designed as a publicity flyer for LaTeX, but \
also serves as an interesting showcase of what LaTeX can do. \
The flyer is designed for printing, double-sided, on A3 paper, \
which would then be folded once."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn40612"

RPM_NAME = "texlive-latex-brochure-2023.209.svn40612-56.1.noarch.rpm"
RPM_HASH = "5b805b963db5f7420393e90726402fc1526e5214cd2db1aa71faed551de6fe672ce99260e147a9c19369d5e80253f53c3dda2e3587251fe11e6ad05b705b8af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-brochure"

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
