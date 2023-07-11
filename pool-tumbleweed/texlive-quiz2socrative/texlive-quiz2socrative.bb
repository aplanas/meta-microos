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

RPM_NAME = "texlive-quiz2socrative-2023.201.1.0svn52276-53.2.noarch.rpm"
RPM_HASH = "62792e3e014e0a07c12c0e363102d9a3317f3c774abc5ecc9e02280c99377b4fb3235788ad2448c57b2edd78186c6407f0c18746970e3515d56321e23f648227"
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
