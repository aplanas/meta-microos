SUMMARY = "Typeset counters in a different base"
DESCRIPTION = "This package typesets a LaTeX counter such as page in an \
arbitrary base (default 16). It does not change font or \
typeface. The package extends the functionality of the existing \
hex LaTeX 2.09 package and provides documentation. However, the \
author is not a mathematician, and suggestions for rewriting \
the code are welcomed. Warning: this is alpha software and may \
contain bugs. Please report problems to the author."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn41012"

RPM_NAME = "texlive-makebase-2023.208.0.0.2svn41012-53.1.noarch.rpm"
RPM_HASH = "36bf86a87b3e3da27f41245c08aeaaaa8d7357c4675308fb7db5a71257109cfbc1892607909fbdf954c6c7f720577bcdaa6c6043ccd653243eeda7471669b830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makebase.sty \
texlive-makebase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
