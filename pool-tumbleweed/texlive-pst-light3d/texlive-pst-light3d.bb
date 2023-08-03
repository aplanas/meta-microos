SUMMARY = "Three dimensional lighting effects (PSTricks)"
DESCRIPTION = "A PSTricks package for three dimensional lighting effects on \
characters and PSTricks graphics, like lines, curves, plots, \
..."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn15878"

RPM_NAME = "texlive-pst-light3d-2023.209.0.0.12svn15878-53.1.noarch.rpm"
RPM_HASH = "9371f747c6a0472ccc9e7fccd61086d41b36b361151958d0e36239711ca2d0ae6fff45a59706c66bdd0eb7434011eb37ad5e26230957340c9ac668aec26dc4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-light3d.sty \
tex-pst-light3d.tex \
texlive-pst-light3d"

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
