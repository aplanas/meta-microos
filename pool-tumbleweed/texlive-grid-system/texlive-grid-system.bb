SUMMARY = "Page organisation, modelled on CSS facilities"
DESCRIPTION = "The package provides the means for LaTeX to implement a grid \
system as known from CSS grid systems. The facility is useful \
for creating box layouts as used in brochures."
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-2023.201.0.0.3.0svn32981-53.1.noarch.rpm"
RPM_HASH = "612695a163150814b763e04a00bea4d48e5148ad37495e97d5467e38dc235d3f1becfe72f87a7ee887382fa397d2bcbfb454cc9ef4fd416653e9616740bfdd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grid-system.sty) \
texlive-grid-system"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(environ.sty) \
tex(forloop.sty) \
tex(ifthen.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
