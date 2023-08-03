SUMMARY = "Support for the work of classicists"
DESCRIPTION = "The package provides classicists with some of the tools that \
are needed for typesetting scholarly publications dealing with \
Greek and Latin texts, with special emphasis on Greek verse. As \
the package's name suggests, its core is a comprehensive set of \
commands for generating metrical schemes and for placing \
prosodical marks on text set in the Latin or the Greek \
alphabet. The rest of the package provides a miscellany of \
commands for symbols (most of them not directly related to \
metre) that are often used in critical editions of classical \
texts. The package does not require any special font: all \
symbols are taken from the Computer Modern fonts (which are \
included in all TeX distributions) and the package's commands \
are based on TeX primitives."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18489"

RPM_NAME = "texlive-metre-2023.209.1.0svn18489-55.1.noarch.rpm"
RPM_HASH = "0a1cdfed660d64cbc929ba170b9004419668c30be579ef9a3023f3ee89303e9908eb7782f321acc07fe809164c259059025b7aefb799ac684d549632cfaf79d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metre.sty \
texlive-metre"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
