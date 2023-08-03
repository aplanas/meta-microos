SUMMARY = "A PSTricks package for tilting and other pseudo-3D tricks"
DESCRIPTION = "The package provides basic macros that use PSTricks for \
shadows, tilting and three dimensional representations of text \
or graphical objects."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn17257"

RPM_NAME = "texlive-pst-3d-2023.209.1.10svn17257-53.1.noarch.rpm"
RPM_HASH = "d4fbf801188776b2c72120119ceb895512388e713fcbdb34e73c50003c22811bbc4e6130c075a0701eabfdd6e2c7dfe672cf8f8bab9388abca01e4d947224376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-3d.sty \
tex-pst-3d.tex \
texlive-pst-3d"

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
