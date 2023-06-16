SUMMARY = "Random walks using TikZ"
DESCRIPTION = "The randomwalk package provides a user command, \\RandomWalk, to \
draw random walks with a given number of steps. Lengths and \
angles of the steps can be customized in various ways. The \
package uses lcg for its 'random' numbers and PGF/TikZ for its \
graphical output."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-2023.201.0.0.6svn49513-53.1.noarch.rpm"
RPM_HASH = "73d349d7fb76cfc72cf7a286940b86d0ba775c6cc3e923a457f37b4e364e0968dcb6567f56f1cb5c08e29e8c0809c552367baacadbbc214034422e4bcbbd3ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randomwalk.sty \
texlive-randomwalk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfcore.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
