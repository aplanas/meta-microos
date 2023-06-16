SUMMARY = "Prepare questions for socrative quizzes"
DESCRIPTION = "This is a LaTeX package for preparing multiple choice, \
true/false, and short answer questions. Its main purpose is to \
offer a tool to easily insert rather complicated mathematical \
material in socrative quizzes (see https://socrative.com). The \
package requires the following other LaTeX packages: calc, \
etoolbox, graphicx, ifthen, listofitems, moresize, TikZ, \
pgfmath, xcolor, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-2023.201.1.0svn52276-53.1.noarch.rpm"
RPM_HASH = "0bd7bea605a8d396b992a749a7803191600a7ae5eb33b76d9ed34f66cbf74b8c08be2fff13291b15e58aec82e0e334e12cf1194908a0e5221473b8c1d96fbdb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quiz2socrative.sty \
texlive-quiz2socrative"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-moresize.sty \
tex-pgfmath.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
