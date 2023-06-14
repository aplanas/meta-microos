SUMMARY = "Write numbers in lower case roman numerals"
DESCRIPTION = "This package provides only two macros viz. \\modromannumeral \
which writes the number given as argument in lower case roman \
numeral with a 'j' instead of a 'i' as the final letter of \
numbers greater than 1 and \\modroman{MyCounter} which writes \
the value of a counter in the same way. You use the first in \
the same way as the TeX primitive \\romannumeral and the second \
as LaTeX command \\roman. The default option is 'vpourv' with \
which 5 is 'translated' as 'v' and option 'upourv' whith which \
the same 5 is given as 'u'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn29803"

RPM_NAME = "texlive-modroman-2023.201.1svn29803-54.1.noarch.rpm"
RPM_HASH = "a3f2e15ff20e45d95c7c0616451b12377d2474987d760d6214c3c605ed1d447a3e57bb61b0305818a7e2cc1aded4edb1980214336d30b7b0da15f7d5a74f03f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modroman.sty \
texlive-modroman"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
