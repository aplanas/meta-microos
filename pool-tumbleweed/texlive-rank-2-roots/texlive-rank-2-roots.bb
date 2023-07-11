SUMMARY = "Draw (mathematical) rank 2 root systems"
DESCRIPTION = "This package concerns mathematical drawings arising in \
representation theory. The purpose of this package is to ease \
drawing of rank 2 root systems, with Weyl chambers, weight \
lattices, and parabolic subgroups. Required packages are tikz, \
etoolbox, expl3, pgfkeys, pgfopts, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-2023.201.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "9e2c2019710524c2c7c18f9d4c65d1dccf96de7a48ca152ca507db098743cf94ca6c46c693ccade62329b90d9f148e0bfb9b7a780b5c7c44a64321790f790905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rank-2-roots.sty \
texlive-rank-2-roots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
