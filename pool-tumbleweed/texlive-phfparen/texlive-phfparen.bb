SUMMARY = "Parenthetic math expressions made simpler and less redundant"
DESCRIPTION = "This package provides a more condensed and flexible syntax for \
parenthesis-delimited expressions in math mode which also \
allows for an easier switching of brace sizes. For example, the \
syntax ' `\\big( a + b ) ' can be used to replace '\\bigl( a + b \
\\bigr)'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41859"

RPM_NAME = "texlive-phfparen-2023.209.1.0svn41859-52.1.noarch.rpm"
RPM_HASH = "20a7eec9276296b99f85bc772b091271869fb044debb824c896f1dd10bfddce2bd18fcdbf144188b20098826758b76dfcc6a37b959e2c9445e46b55542e1d127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfparen.sty \
texlive-phfparen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-mathtools.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
