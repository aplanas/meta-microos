SUMMARY = "A collection of easy-to-use macros"
DESCRIPTION = "The collection comprises: easybib, support for customising \
bibliographies; easybmat, support for composing block matrices; \
easyeqn, support for various aspects of equations; easymat, \
support for composing matrices; easytable, support for writing \
tables; easyvector, a C-like syntax for writing vectors."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99svn19440"

RPM_NAME = "texlive-easy-2023.209.0.0.99svn19440-54.1.noarch.rpm"
RPM_HASH = "b08df2d2b7531db9497ce29ac955715c32d4395a3d18903eb1aae7860c282ab39d08383befbb2d309836003d4705fad8b5d0ad05f751519546fb8c146c649168"
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
