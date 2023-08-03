SUMMARY = "Support for syllables in the Devanagari script"
DESCRIPTION = "This LaTeX3 package provides macros and interfaces to work with \
Devanagari characters and syllables in a more correct way."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn56277"

RPM_NAME = "texlive-akshar-2023.209.0.0.2svn56277-55.1.noarch.rpm"
RPM_HASH = "1743e138daddbc9a04820cbb893031292b464e397703b9f47e2a101f56b29b2d55a4dfb72d4a99bea7cbe271fb173493cc2d269011fe14c5db690725d5281f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-akshar.sty \
texlive-akshar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
