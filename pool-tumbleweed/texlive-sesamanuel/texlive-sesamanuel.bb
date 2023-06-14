SUMMARY = "Class and package for sesamath books or paper"
DESCRIPTION = "The package contains a sesamanuel class which could be used to \
compose a student's classroom book with LaTeX, and also a \
sesamanuelTIKZ style to be used for TikZ pictures in the \
sesamath book."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn36613"

RPM_NAME = "texlive-sesamanuel-2023.201.0.0.6svn36613-53.1.noarch.rpm"
RPM_HASH = "9b3041d9c32ff1d9b2338982c95642db0b6ba9acdc8d1690addf069a8788dba084ac76395a4aeec93fb8f15c857868a39a02c86ff3f1316a00bd4d55a7c2a511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sesamanuel.cls \
tex-sesamanuel.sty \
tex-sesamanuelTIKZ.sty \
texlive-sesamanuel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-babel.sty \
tex-book.cls \
tex-colortbl.sty \
tex-crop.sty \
tex-esvect.sty \
tex-etex.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-helvet.sty \
tex-ifmtarg.sty \
tex-inputenc.sty \
tex-longtable.sty \
tex-mathpazo.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-multido.sty \
tex-multirow.sty \
tex-numprint.sty \
tex-pgf.sty \
tex-pifont.sty \
tex-pst-all.sty \
tex-pstricks-add.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-tkz-tab.sty \
tex-xcolor.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
