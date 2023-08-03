SUMMARY = "Random walks using TikZ"
DESCRIPTION = "The randomwalk package provides a user command, \\RandomWalk, to \
draw random walks with a given number of steps. Lengths and \
angles of the steps can be customized in various ways. The \
package uses lcg for its 'random' numbers and PGF/TikZ for its \
graphical output."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-2023.209.0.0.6svn49513-54.1.noarch.rpm"
RPM_HASH = "69d71dabe5cb096c1317dd74228e3bd5dc6a2989db24c3759f1d8b34c64fe7ba679cc70d17e2427576005e7517dfe59bfcf9f2f7561086ab4161541e7c8ac67f"
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
