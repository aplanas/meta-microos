SUMMARY = "Draw perspective views using PSTricks"
DESCRIPTION = "The package provides the means to draw an orthogonal parallel \
projection with an arbitrarily chosen angle and a variable \
shortening factor."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-2023.209.1.05svn39585-54.1.noarch.rpm"
RPM_HASH = "00aae40cd4465d190ffbad06bac9eeec43c349351c5406b854d06fe127f9999e3c4154a96571da9543a630656bff8bf60ad7b4eeb1829c8f804f26c2d7ad91e0"
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
