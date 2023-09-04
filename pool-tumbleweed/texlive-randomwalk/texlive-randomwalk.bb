SUMMARY = "Random walks using TikZ"
DESCRIPTION = "The randomwalk package provides a user command, \\RandomWalk, to \
draw random walks with a given number of steps. Lengths and \
angles of the steps can be customized in various ways. The \
package uses lcg for its 'random' numbers and PGF/TikZ for its \
graphical output."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-2023.209.0.0.6svn49513-54.2.noarch.rpm"
RPM_HASH = "ac574413796b4aab7755bc14bad920427e1a42e00ac7a4f8fbb4ae1f85d84db39ea5d80316778c084656efd9c10777daf7f5bf2a9e20b2447467cb6c483f7bd1"
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
