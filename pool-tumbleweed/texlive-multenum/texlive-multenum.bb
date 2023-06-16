SUMMARY = "Multi-column enumerated lists"
DESCRIPTION = "Defines an environment multienumerate, that produces an \
enumerated array in which columns are vertically aligned on the \
counter. The motivation was lists of answers for a text book, \
where there are many rather small items; the multienumerate \
environment goes some way to making such lists look neater."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21775"

RPM_NAME = "texlive-multenum-2023.201.svn21775-54.1.noarch.rpm"
RPM_HASH = "651be48e30dbb6ad453f7f44b512886b27da86f8aa801323a00a702c0d52f8367ca150801afe241e396d976ed8a2752ed74c123e46c30a0519b6a12eddd4032e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multienum.sty \
texlive-multenum"

RDEPENDS:${PN} += "/usr/bin/sh \
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
