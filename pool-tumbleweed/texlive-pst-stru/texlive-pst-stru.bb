SUMMARY = "Civil engineering diagrams, using PSTricks"
DESCRIPTION = "This PSTricks-based package provides facilities to draw \
structural schemes in civil engineering analysis, for beams, \
portals, arches and piles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-2023.201.0.0.13svn38613-53.1.noarch.rpm"
RPM_HASH = "20d55f215601da53febd0732b15b46438de4a4ca91e6595a94996f34273311ef1b639ba645e73934dce42592ad027701ae367066fa43e3c7668fce69333450f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-stru.sty) \
tex(pst-stru.tex) \
texlive-pst-stru"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
