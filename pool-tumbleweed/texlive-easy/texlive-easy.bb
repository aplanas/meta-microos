SUMMARY = "A collection of easy-to-use macros"
DESCRIPTION = "The collection comprises: easybib, support for customising \
bibliographies; easybmat, support for composing block matrices; \
easyeqn, support for various aspects of equations; easymat, \
support for composing matrices; easytable, support for writing \
tables; easyvector, a C-like syntax for writing vectors."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99svn19440"

RPM_NAME = "texlive-easy-2023.201.0.0.99svn19440-53.1.noarch.rpm"
RPM_HASH = "24d4fd7f163bfcf90ef55f200585c063c60c668e978ae11ddad13ad9c0040126a97cd185ee05a9cf871a0878b675afa829f5edc47157a8911755ea3a8400e90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easy.sty \
tex-easybib.sty \
tex-easybmat.sty \
tex-easyeqn.sty \
tex-easymat.sty \
tex-easytable.sty \
tex-easyvector.sty \
texlive-easy"

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
