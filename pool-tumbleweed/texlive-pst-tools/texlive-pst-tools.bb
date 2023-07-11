SUMMARY = "PSTricks support functions"
DESCRIPTION = "The package provides helper functions for other PSTricks \
related packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-2023.201.0.0.12svn60621-53.2.noarch.rpm"
RPM_HASH = "6cab7b5d0cceb530550d9c5931029e493e982b21522ec8442d91afd4184eed6ba3786cf086ff7c66e92d8323b3b965a150ea428444fe1befdacd0a2c844b37e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tools.sty \
tex-pst-tools.tex \
texlive-pst-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
