SUMMARY = "Draw perspective views using PSTricks"
DESCRIPTION = "The package provides the means to draw an orthogonal parallel \
projection with an arbitrarily chosen angle and a variable \
shortening factor."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-2023.201.1.05svn39585-53.1.noarch.rpm"
RPM_HASH = "51a899d78afeb4d4ecec14cc8d4faa5cb619ba82f942cc261dc9bcdb22e83197b1927346b24084e283e39a399ce3a4a3f9cc246740cb8c90aaa5f5211d4eab6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-perspective.sty) \
tex(pst-perspective.tex) \
texlive-pst-perspective"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pst-grad.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
