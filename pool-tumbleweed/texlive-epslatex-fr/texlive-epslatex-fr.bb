SUMMARY = "French version of 'graphics in LaTeX'"
DESCRIPTION = "This is the French translation of epslatex, and describes how \
to use imported graphics in LaTeX(2e) documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-epslatex-fr-2023.201.svn19440-53.2.noarch.rpm"
RPM_HASH = "23c2be50c66095c786b690ad2e93101082fad95c671f77fb775c27dc65075a21b4eb54a0ae75920a804b6169226139882b0efbe2e2413137f4d83d678b048f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epslatex-fr"

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
