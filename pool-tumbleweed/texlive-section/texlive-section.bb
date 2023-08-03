SUMMARY = "Modifying section commands in LaTeX"
DESCRIPTION = "The package implements a pretty extensive scheme to make more \
manageable the business of configuring LaTeX output."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20180"

RPM_NAME = "texlive-section-2023.209.svn20180-54.1.noarch.rpm"
RPM_HASH = "1688168cf755c2b5668639499c6edb72110f727a032a8faf1ac26a812375d78f11a6b6a4d610b92d7fe6a1506fead577499f3e9f78aee7ebffb0f0b40ba0ef09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-section.sty \
texlive-section"

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
