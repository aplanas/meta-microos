SUMMARY = "Draw signal flow graphs"
DESCRIPTION = "Defines some commands to draw signal flow graphs as used by \
electrical and electronics engineers and graph theorists. \
Requires fp and pstricks packages (and a relatively fast \
machine)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn20209"

RPM_NAME = "texlive-sfg-2023.209.0.0.91svn20209-54.1.noarch.rpm"
RPM_HASH = "00f30c65b5015b5bab860e884af7467a14f10d9ad5ef6247958d5c745b924e53a70e74b7bc813c045f769182558d8a1a005a4eb0e0481a66eaebe58dd1fa8f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sfg.sty \
texlive-sfg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
