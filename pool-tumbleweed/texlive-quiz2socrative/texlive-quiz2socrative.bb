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

RPM_NAME = "texlive-quiz2socrative-2023.209.1.0svn52276-54.1.noarch.rpm"
RPM_HASH = "e95554d35cd57e34b941e9e1bbb80ff963857c6e3b4d0a3f2804deb8c8179aaa6088a04ce13167e6933069897d91851083537125aa7b8877519208e9895bc0f8"
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
