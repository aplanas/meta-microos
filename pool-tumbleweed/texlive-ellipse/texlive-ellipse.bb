SUMMARY = "Draw ellipses and elliptical arcs using the standard LaTeX2e picture environment"
DESCRIPTION = "Draw ellipses and elliptical arcs using the standard LaTeX2e \
picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39025"

RPM_NAME = "texlive-ellipse-2023.209.1.0svn39025-54.2.noarch.rpm"
RPM_HASH = "098597b8fb61a61136f2daf5bad96e31e1edaa2fb1888556d34817fbc5466404f298c803854b2bf2b6600708c12dc341fee5a5f12a0998cae1598f90d34e4a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipse.sty \
texlive-ellipse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
