SUMMARY = "Dijkstra algorithm for LaTeX"
DESCRIPTION = "This small package uses the Dijkstra algorithm for weighted \
graphs,directed or not: the search table of the shortest path \
can be displayed, the minimum distance between two vertices and \
the corresponding path are stored in macros. This packages \
depends on simplekv."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn64580"

RPM_NAME = "texlive-dijkstra-2023.209.0.0.13svn64580-53.1.noarch.rpm"
RPM_HASH = "d6cd9497a8ca5bd3959f30e228461ab3f542bd297e588114edd87356c48a83af5472664818339ea89275c669732a4d7deaa1322a0ce47323080f819ace4e547b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dijkstra.sty \
texlive-dijkstra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
