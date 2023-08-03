SUMMARY = "Draw (mathematical) rank 2 root systems"
DESCRIPTION = "This package concerns mathematical drawings arising in \
representation theory. The purpose of this package is to ease \
drawing of rank 2 root systems, with Weyl chambers, weight \
lattices, and parabolic subgroups. Required packages are tikz, \
etoolbox, expl3, pgfkeys, pgfopts, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "7144fe2bdac546e23740d3360e3a28ce71d1ede77cac24f541617470fe45791a988241f008c8acdda72e3c444b4e49a9723777702e72cfe41cdb77e00e1d14d4"
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
