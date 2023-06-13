SUMMARY = "Measure restriction symbol in LaTeX"
DESCRIPTION = "This package provides a simple macro \\resmes that prints the \
measure restriction symbol."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65375"

RPM_NAME = "texlive-resmes-2023.201.1.0svn65375-53.1.noarch.rpm"
RPM_HASH = "de4aae7a5901331e7073abefbc0b33639e18771aa5177a38fd9ca50bab8d990ddad4c992eb849baffc44b2120bd3a104e72fce36ace1ad70928f1408bb1ab17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(resmes.sty) \
texlive-resmes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
