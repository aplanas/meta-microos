SUMMARY = "Page layout macros based on PSTricks packages"
DESCRIPTION = "The package provides a means of creating elaborate \
('pseudo-tabular') layouts of material, typically to be \
overlaid on an included graphic. The package requires a recent \
version of the package pst-node and some other pstricks-related \
material."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.95svn29803"

RPM_NAME = "texlive-pst-layout-2023.201.0.0.95svn29803-52.1.noarch.rpm"
RPM_HASH = "e240c770f4a0e4a5d35ccd8d18332699b6c2f7edfb6d0dd5c4c642fbd53b41103fd3135dec883d49668bc88b5541162e63b088ac0477fcbb8eba6df49c1acc32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-layout.sty) \
texlive-pst-layout"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(arrayjobx.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
