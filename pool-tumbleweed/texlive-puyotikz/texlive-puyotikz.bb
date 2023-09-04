SUMMARY = "Quickly typeset board states of Puyo Puyo games"
DESCRIPTION = "This LaTeX package permits to quickly typeset board states of \
Puyo Puyo games. It supports large and small boards with \
arbitrary shape, hidden rows, current and next puyos, labels \
and move planning markers. The package requires Python3 in \
support of scripts driven by PythonTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-2023.209.1.0.1svn57254-54.2.noarch.rpm"
RPM_HASH = "f9a6ff68c1a9b509ca40d5a49fea2b0a185896d1161e4973fd03eeff00a6deeaccdd23a4d46ec4ac633cabce02f2bdfb77d36d4f32c6583e71bfb5b496e4e9dc"
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
