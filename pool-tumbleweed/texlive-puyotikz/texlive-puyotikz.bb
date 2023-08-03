SUMMARY = "Quickly typeset board states of Puyo Puyo games"
DESCRIPTION = "This LaTeX package permits to quickly typeset board states of \
Puyo Puyo games. It supports large and small boards with \
arbitrary shape, hidden rows, current and next puyos, labels \
and move planning markers. The package requires Python3 in \
support of scripts driven by PythonTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-2023.209.1.0.1svn57254-54.1.noarch.rpm"
RPM_HASH = "db0902ca3bc5bc2c7be1db2cf7a5bcd3602c06a8792361aa9fe5e36c88ebdfebb973bf6bb54ae1e00b8203aee1c7d28cb8d9690a9e61949736894a4efa336d7d"
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
