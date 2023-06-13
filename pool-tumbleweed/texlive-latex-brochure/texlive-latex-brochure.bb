SUMMARY = "A publicity flyer for LaTeX"
DESCRIPTION = "The document is designed as a publicity flyer for LaTeX, but \
also serves as an interesting showcase of what LaTeX can do. \
The flyer is designed for printing, double-sided, on A3 paper, \
which would then be folded once."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn40612"

RPM_NAME = "texlive-latex-brochure-2023.201.svn40612-55.1.noarch.rpm"
RPM_HASH = "2e8370a519e3aa4d345e46d0110c4896b1da585ca87a8033a681dae7fd04a70c57370997d8cc367884878e09fb8e93f0fa1be9299c54d5b2c648c5529df2a54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-brochure"

RDEPENDS:${PN} += "/bin/sh \
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
