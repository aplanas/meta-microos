SUMMARY = "Package for subequation numbering"
DESCRIPTION = "Sometimes it is necessary to be able to refer to subexpressions \
of an equation. In order to do that these subexpressions should \
be numbered. In standard LaTeX there is no provision for this. \
To solve this problem Stephen Gildea once wrote subeqn.sty for \
LaTeX 2.09; Donald Arsenau rewrote the macros and Johannes \
Braams made them available for LaTeX2e. Note that this package \
is not compatible with the package subeqnarray (written by \
Johannes Braams), but it can be used together with the LaTeX \
class options leqno and fleqn."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn15878"

RPM_NAME = "texlive-subeqn-2023.209.2.0bsvn15878-58.1.noarch.rpm"
RPM_HASH = "e0b558b323288d3621b6c949248099a3adcad1dba36964e2346cf0ccbe80c7c87c018e8729858aae40a684707a77ccc901fa32c43b9b73cb69e3b553f137e5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subeqn.sty \
texlive-subeqn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
