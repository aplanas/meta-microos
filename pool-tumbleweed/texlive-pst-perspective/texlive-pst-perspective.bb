SUMMARY = "Draw perspective views using PSTricks"
DESCRIPTION = "The package provides the means to draw an orthogonal parallel \
projection with an arbitrarily chosen angle and a variable \
shortening factor."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-2023.209.1.05svn39585-54.2.noarch.rpm"
RPM_HASH = "d38fc53bd00f07bba6649529b1b2dc7eee3b49787fc1f5c9cc8808d632bb1a19e1d09390cae87e00241eddc4255ce3ba7143c7571043fba738644f541d172434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-perspective.sty \
tex-pst-perspective.tex \
texlive-pst-perspective"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-grad.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
