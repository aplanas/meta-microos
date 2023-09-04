SUMMARY = "Prepare questions for socrative quizzes"
DESCRIPTION = "This is a LaTeX package for preparing multiple choice, \
true/false, and short answer questions. Its main purpose is to \
offer a tool to easily insert rather complicated mathematical \
material in socrative quizzes (see https://socrative.com). The \
package requires the following other LaTeX packages: calc, \
etoolbox, graphicx, ifthen, listofitems, moresize, TikZ, \
pgfmath, xcolor, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-2023.209.1.0svn52276-54.2.noarch.rpm"
RPM_HASH = "8274caa8c096b1ba98b516cbca5c3f7c17c0cdf452da68e3f0ff9edc80d9998d543edcce184f982b8942c3b8bd5ae1161e3a9404b85f6db2d5c409229e53cb86"
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
