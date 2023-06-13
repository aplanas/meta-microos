SUMMARY = "Numbered cases environment"
DESCRIPTION = "This package provides a LaTeX environment 'numcases' to produce \
multi-case equations with a separate equation number for each \
case. There is also a 'subnumcases' environment which numbers \
each case with the overall equation number plus a letter [8a, \
8b, etc.]."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn54682"

RPM_NAME = "texlive-cases-2023.201.3.2svn54682-52.1.noarch.rpm"
RPM_HASH = "54fbbbb15ae86425bad2b1289f32420216ece15a7f0e04848274fe57e50a256997aebdd36d8d9a1f6cdb4dc8edc35399e53ebfc8e14e71566a25b148ef9ff687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cases.sty) \
texlive-cases"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
