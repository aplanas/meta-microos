SUMMARY = "Typeset lists as tables"
DESCRIPTION = "The listliketab package helps the user make list-like tabulars, \
i.e., a tabular that is indistinguishable from an itemize or \
enumerate environment. The advantage of using a tabular is that \
the user can add additional columns to each entry in the list."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-listliketab-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "37b946dd46d0993d99dc0340561dd21806f74376f2ffcee03a82b738b21e52ebe575a235d7daf071dff320468aadc06d909073cb9b5bd96e5847288fa28b1467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listliketab.sty \
texlive-listliketab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
