SUMMARY = "Random walks using TikZ"
DESCRIPTION = "The randomwalk package provides a user command, \\RandomWalk, to \
draw random walks with a given number of steps. Lengths and \
angles of the steps can be customized in various ways. The \
package uses lcg for its 'random' numbers and PGF/TikZ for its \
graphical output."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-2023.201.0.0.6svn49513-53.2.noarch.rpm"
RPM_HASH = "f2f2500eee6621938ac86cdc61c4299dbdb8d22e9090472332e49ee160793ca2981948806c441dfcccb81cc2994422076eebe705263bdaaf18d651df142806a6"
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
