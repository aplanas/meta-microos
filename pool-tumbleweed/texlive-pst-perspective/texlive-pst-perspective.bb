SUMMARY = "Draw perspective views using PSTricks"
DESCRIPTION = "The package provides the means to draw an orthogonal parallel \
projection with an arbitrarily chosen angle and a variable \
shortening factor."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-2023.201.1.05svn39585-53.2.noarch.rpm"
RPM_HASH = "b7f0db69fbae12185b1403287d9d8905f5027daac57e20c29850459d49752abcdc05f8032c75aaea6f9aae18ab4f8b64b34889ce045ccb586873d1316fe66069"
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
