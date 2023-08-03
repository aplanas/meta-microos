SUMMARY = "A beamer theme designed for use in the University of Leeds"
DESCRIPTION = "The bundle provides a simple theme that has been used in the \
author's department."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02svn39048"

RPM_NAME = "texlive-beamertheme-detlevcm-2023.209.1.02svn39048-54.1.noarch.rpm"
RPM_HASH = "265ebb2ce9ab6fdcdf8068d04fd7be5ac07ad50d0610ff3d7698c611d3cb97225529104b52bd0cf9b748774e0d8b90b274246693a0f27ac6d3043819b1b628f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeETII.sty \
tex-beamerfontthemeDetlevCM.sty \
tex-beamerouterthemeDetlevCM.sty \
tex-beamerthemeDetlevCM.sty \
texlive-beamertheme-detlevcm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
