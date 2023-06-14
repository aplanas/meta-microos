SUMMARY = "Typeset two columns in parallel"
DESCRIPTION = "This is a simple wrapper for the paracol package for setting \
two-column parallel text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn59643"

RPM_NAME = "texlive-bilingualpages-2023.201.1.0.0svn59643-53.1.noarch.rpm"
RPM_HASH = "06b0262a5b57d26971abfe52ab267943a7fca3f77812dd4c83a518eac35c082243523a65a08ac167878d826f0631782349a7ae10ad90e89f8a8b253576a33763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bilingualpages.sty \
texlive-bilingualpages"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paracol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
