SUMMARY = "A class for academic reports, especially PhD theses"
DESCRIPTION = "Hepthesis is a LaTeX class for typesetting large academic \
reports, in particular PhD theses. It was originally developed \
for typesetting the author's high-energy physics PhD thesis and \
includes some features specifically tailored to such an \
application. In particular, hepthesis offers: Attractive \
semantic environments for various rubric sections; Extensive \
options for draft production, screen viewing and binding-ready \
output; Helpful extensions of existing environments, including \
equation and tabular; and Support for quotations at the start \
of the thesis and each chapter. The class is based on scrbook, \
from the KOMA-Script bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn46054"

RPM_NAME = "texlive-hepthesis-2023.201.1.5.2svn46054-53.1.noarch.rpm"
RPM_HASH = "84f13cb1f34ffbcf8e69c3f4cd6968ea5134a30e1217d52cbf9af8e3657119ba56a0dd28fe94fcea0a2d58016219d2a2f67dc7e58e7106577cbb26ab1001d00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepthesis.cls \
texlive-hepthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-afterpage.sty \
tex-amsmath.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-changepage.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-draftcopy.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-hep.sty \
tex-hyperref.sty \
tex-lineno.sty \
tex-makeidx.sty \
tex-microtype.sty \
tex-rotating.sty \
tex-scrbook.cls \
tex-setspace.sty \
tex-titling.sty \
tex-tocbibind.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
