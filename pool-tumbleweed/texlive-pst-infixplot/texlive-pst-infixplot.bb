SUMMARY = "Using PSTricks plotting capacities with infix expressions rather than RPN"
DESCRIPTION = "Plotting functions with pst-plot is very powerful but sometimes \
difficult to learn since the syntax of \\psplot and \
\\parametricplot requires some PostScript knowledge. The \
infix-RPN and pst-infixplot styles simplify the usage of \
pst-plot for the beginner, providing macro commands that \
convert natural mathematical expressions to PostScript syntax."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn15878"

RPM_NAME = "texlive-pst-infixplot-2023.209.0.0.11svn15878-53.1.noarch.rpm"
RPM_HASH = "9dd1d3fc3b9db9567ff655dc1400261ba29991b3a300cc18be83dfa75fa937eacdb4cce1bfb94d18adff3087d8a84a9245f1d051f83f659c9afee667f89875b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infix-RPN.sty \
tex-infix-RPN.tex \
tex-pst-infixplot.sty \
tex-pst-infixplot.tex \
texlive-pst-infixplot"

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
