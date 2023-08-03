SUMMARY = "Images on a spherical mirror"
DESCRIPTION = "The package provides commands and supporting PostScript \
material for drawing images as if reflected by a spherical \
mirror."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn60506"

RPM_NAME = "texlive-pst-mirror-2023.209.1.02svn60506-53.1.noarch.rpm"
RPM_HASH = "f8a4f86e1572a477f21751364493f1769a34e5754ebbd7146003cc3eb0e8df9a9a715b504b5bb0511385f240378606b87365b23ddd8f8c271ecefc324de095d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-mirror.sty \
tex-pst-mirror.tex \
texlive-pst-mirror"

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
