SUMMARY = "Class for Brandeis University dissertations"
DESCRIPTION = "The class will enable the user to typeset a dissertation which \
adheres to the formatting guidelines of Brandeis University \
Graduate School of Arts and Sciences (GSAS)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.13svn61215"

RPM_NAME = "texlive-brandeis-dissertation-2023.209.3.13svn61215-53.1.noarch.rpm"
RPM_HASH = "10cf19d36c49fba78d987d39be239a1265e252a4547a657e7f1a62fdcfa84abaa897b686aba8425df32c30c36ea235fe46785b81dc78465be6028e7a5ae7efb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-dissertation.cls \
texlive-brandeis-dissertation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-book.cls \
tex-csquotes.sty \
tex-geometry.sty \
tex-inputenc.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
