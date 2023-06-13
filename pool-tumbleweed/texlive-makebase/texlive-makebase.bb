SUMMARY = "Typeset counters in a different base"
DESCRIPTION = "This package typesets a LaTeX counter such as page in an \
arbitrary base (default 16). It does not change font or \
typeface. The package extends the functionality of the existing \
hex LaTeX 2.09 package and provides documentation. However, the \
author is not a mathematician, and suggestions for rewriting \
the code are welcomed. Warning: this is alpha software and may \
contain bugs. Please report problems to the author."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn41012"

RPM_NAME = "texlive-makebase-2023.201.0.0.2svn41012-52.1.noarch.rpm"
RPM_HASH = "1bfac7671d1e43ed49686e42b825f0c2776ea66f746d8b41b613da0460a0e07b62cbf279ee9c00bf195db9c1cef81726176141a5b83e38f5aeb5cc71d9d6b4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(makebase.sty) \
texlive-makebase"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
