SUMMARY = "A collection of easy-to-use macros"
DESCRIPTION = "The collection comprises: easybib, support for customising \
bibliographies; easybmat, support for composing block matrices; \
easyeqn, support for various aspects of equations; easymat, \
support for composing matrices; easytable, support for writing \
tables; easyvector, a C-like syntax for writing vectors."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99svn19440"

RPM_NAME = "texlive-easy-2023.201.0.0.99svn19440-53.2.noarch.rpm"
RPM_HASH = "e5cd2419dcf00ab75613fd86d71c8070707ab29bf7aa4b198dae3a0311717933278dee7b6c4ee6a5c5649b3de960ed683d33ac11b70e34aa62ffcf562478e569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easy.sty \
tex-easybib.sty \
tex-easybmat.sty \
tex-easyeqn.sty \
tex-easymat.sty \
tex-easytable.sty \
tex-easyvector.sty \
texlive-easy"

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
