SUMMARY = "Calculate formulas in a tabular environment"
DESCRIPTION = "Given a list of numbers and one (or more) formulas, the package \
offers an easy syntax to build a table of values, i.e., a \
tabular in which the first row contains the list of numbers, \
and the other rows contain the calculated values of the \
formulas for each number of the list. The table may be built \
either horizontally or vertically and is fully customizable."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-tabularcalc-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "db8e9e1e83fac8f11cb708d055a323f895bb4ae1038e406280a29e5f1a0bb5b6b41e681480c93da0f9037f651684ecb714a0f6ec74a220ea285c891b78a9edc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularcalc.sty \
texlive-tabularcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-numprint.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
