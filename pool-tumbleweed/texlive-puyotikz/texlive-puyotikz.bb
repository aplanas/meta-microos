SUMMARY = "Quickly typeset board states of Puyo Puyo games"
DESCRIPTION = "This LaTeX package permits to quickly typeset board states of \
Puyo Puyo games. It supports large and small boards with \
arbitrary shape, hidden rows, current and next puyos, labels \
and move planning markers. The package requires Python3 in \
support of scripts driven by PythonTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-2023.201.1.0.1svn57254-53.1.noarch.rpm"
RPM_HASH = "1efc786d4c5ef1e312a5f7b44a9d1543ad3ab2397ba7c344d16f1adf2fca46739d98a05b3b39848f349a509121d3869fd15676e622137353cbfb36d8e333fe10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-puyotikz.sty \
texlive-puyotikz"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
