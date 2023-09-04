SUMMARY = "Draw (mathematical) rank 2 root systems"
DESCRIPTION = "This package concerns mathematical drawings arising in \
representation theory. The purpose of this package is to ease \
drawing of rank 2 root systems, with Weyl chambers, weight \
lattices, and parabolic subgroups. Required packages are tikz, \
etoolbox, expl3, pgfkeys, pgfopts, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-2023.209.1.0svn61719-54.2.noarch.rpm"
RPM_HASH = "c5a0854c6ab2e58eb5ea2f84cd60139b56ae75dc497dc0b9903b0618ea348bdc4da089986092a26b95f715dab6add7615230624b73c91bb7287d53fdcb1e6070"
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
