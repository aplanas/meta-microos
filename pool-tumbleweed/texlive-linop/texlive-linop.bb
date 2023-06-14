SUMMARY = "Typeset linear operators as they appear in quantum theory or linear algebra"
DESCRIPTION = "This small package aims to provide two simple commands and many \
options to easily write linear operators as they appear in \
many-body physics, quantum theory, and linear algebra, in any \
of the ways commonly in use."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41304"

RPM_NAME = "texlive-linop-2023.201.0.0.1svn41304-54.1.noarch.rpm"
RPM_HASH = "d3de263e89e8c8572aeece0fac43c0dd637f456cb9f8bff55c2657d10379b1ff2c71fff523524b908e4eca35e7ae185509d89489ee52efc0a21e6a4b1a8ae722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linop.sty \
texlive-linop"

RDEPENDS:${PN} += "/bin/sh \
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
