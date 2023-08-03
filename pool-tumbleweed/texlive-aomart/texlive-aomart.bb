SUMMARY = "Typeset articles for the Annals of Mathematics"
DESCRIPTION = "The package provides a class for typesetting articles for The \
Annals of Mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.27svn63442"

RPM_NAME = "texlive-aomart-2023.209.1.27svn63442-55.1.noarch.rpm"
RPM_HASH = "5e7929ff197206528da43b1df2078fce5377ba699e9c5a28d1e4152425b0da9954747d0d8d5bd4b6517dae6d942153f9693da97f2de32d5e713e5a9245ba72bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aomart.cls \
texlive-aomart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-cmtiup.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-lastpage.sty \
tex-yhmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
