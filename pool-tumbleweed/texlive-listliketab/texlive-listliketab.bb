SUMMARY = "Typeset lists as tables"
DESCRIPTION = "The listliketab package helps the user make list-like tabulars, \
i.e., a tabular that is indistinguishable from an itemize or \
enumerate environment. The advantage of using a tabular is that \
the user can add additional columns to each entry in the list."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-listliketab-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "60cf8738f00f671cfbd7a895d07f5e8d2333c58eeb080234a6b5526a7d9aab8968fae3c3ce41ef16d530c30b3e78cec3d745903fe897899c7fb0a8d1ab1e28d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(listliketab.sty) \
texlive-listliketab"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(calc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
