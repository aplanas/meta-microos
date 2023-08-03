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

PV = "2023.209.1svn29803"

RPM_NAME = "texlive-modroman-2023.209.1svn29803-55.1.noarch.rpm"
RPM_HASH = "8a7c728a63db2627b98305053791677c4a433008c756f6b82d2e0ef6157a17f65bd5e900d3ebc144af5767ca63d8be377a03ed8d04ae16f9cbd0b781bf37bfe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modroman.sty \
texlive-modroman"

RDEPENDS:${PN} += "/usr/bin/sh \
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
