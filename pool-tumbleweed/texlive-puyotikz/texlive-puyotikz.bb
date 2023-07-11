SUMMARY = "Quickly typeset board states of Puyo Puyo games"
DESCRIPTION = "This LaTeX package permits to quickly typeset board states of \
Puyo Puyo games. It supports large and small boards with \
arbitrary shape, hidden rows, current and next puyos, labels \
and move planning markers. The package requires Python3 in \
support of scripts driven by PythonTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-2023.201.1.0.1svn57254-53.2.noarch.rpm"
RPM_HASH = "c84c1095ca0f96b6dc7caafe3f0992d82d40000af69f8e68c2e18a068352a2ae94b998a0a59e2d0c475079fa52c87e6350b980b18019888ed4b751caa319de4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-puyotikz.sty \
texlive-puyotikz"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pythontex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
