SUMMARY = "French version of 'graphics in LaTeX'"
DESCRIPTION = "This is the French translation of epslatex, and describes how \
to use imported graphics in LaTeX(2e) documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-epslatex-fr-2023.209.svn19440-54.1.noarch.rpm"
RPM_HASH = "af10e2af44fe72a9865ce61a28657c8bd5c83b2e8da682300d9ae72712e4ba43a6f4722cc7692d3d3af90285ac4476d69a02d55f5c937476ce8e766cafef0469"
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
