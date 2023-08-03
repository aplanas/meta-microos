SUMMARY = "Typeset linear operators as they appear in quantum theory or linear algebra"
DESCRIPTION = "This small package aims to provide two simple commands and many \
options to easily write linear operators as they appear in \
many-body physics, quantum theory, and linear algebra, in any \
of the ways commonly in use."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41304"

RPM_NAME = "texlive-linop-2023.209.0.0.1svn41304-55.1.noarch.rpm"
RPM_HASH = "3c6d013f4f77619e9983af8a62c9fa6284190d3c023949570f02484c158d582822d43dcf99c7de67351c598890a8304845b1e16e99257ac3a7f31cd6f9b44105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linop.sty \
texlive-linop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bm.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
