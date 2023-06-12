SUMMARY = "Draw laboratory equipment"
DESCRIPTION = "This package was developed to help French chemistry teachers to \
create drawings (using TikZ) for laboratory stuff."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63147"

RPM_NAME = "texlive-proflabo-2023.201.1.0svn63147-52.1.noarch.rpm"
RPM_HASH = "6742372cd6c9120ba09b07d3ce64a343252f1289491c264f66c24dfe3dd123670a9059069ecd1b033b83e5f66a021445e32ee277dd745bae480cbeff4d0407a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ProfLabo.sty) \
texlive-proflabo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(listofitems.sty) \
tex(pgf.sty) \
tex(simplekv.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
