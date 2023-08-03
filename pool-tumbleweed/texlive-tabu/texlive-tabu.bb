SUMMARY = "Flexible LaTeX tabulars"
DESCRIPTION = "The package provides an environment, tabu, which will make any \
sort of tabular (that doesn't need to split across pages), and \
an environment longtabu which provides the facilities of tabu \
in a modified longtable environment. (Note that this latter \
offers an enhancement of ltxtable.) The package requires the \
array package, and needs e-TeX to run (since array.sty is \
present in every conforming distribution of LaTeX, and since \
every publicly available LaTeX format is built using e-TeX, the \
requirements are provided by default on any reasonable system). \
The package also requires xcolor for coloured rules in tables, \
and colortbl for coloured cells. The longtabu environment \
further requires that longtable be loaded. The package itself \
does not load any of these packages for the user. The tabu \
environment may be used in place of tabular, tabular* and \
tabularx environments, as well as the array environment in \
maths mode. It overloads tabularx's X-column specification, \
allowing a width specification, alignment (l, r, c and j) and \
column type indication (p, m and b). \\begin{tabu} to <dimen> \
specifies a target width, and \\begin{tabu} spread <dimen> \
enlarges the environment's 'natural' width."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn61719"

RPM_NAME = "texlive-tabu-2023.209.2.9svn61719-55.1.noarch.rpm"
RPM_HASH = "7d65c37505a99e63fcb81625746d6709cabf1233aa712e478c3ec79e24f764c591ea575d6ea593c370987edd67e9ea75b9ea0f497a96a84d89c08cdebe25bd77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabu.sty \
texlive-tabu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-delarray.sty \
tex-linegoal.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-varwidth"

inherit rpm
