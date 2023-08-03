SUMMARY = "Bidi-aware page grid in background"
DESCRIPTION = "The package is based on pagegrid."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34632"

RPM_NAME = "texlive-bidipagegrid-2023.209.0.0.2svn34632-54.1.noarch.rpm"
RPM_HASH = "4d40b35c8ce0aac21bac1be524b52e7807cc729ac414daa4fcdf31b63bd73fa8e2947551812f2037912dbbe11270212c81160755767cf4e5a8c400d7e7f8a9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidipagegrid.sty \
texlive-bidipagegrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
