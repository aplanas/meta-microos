SUMMARY = "PSTricks package for displaying knots"
DESCRIPTION = "The package can produce a fair range of knot shapes, with all \
the standard graphics controls one expects."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn16033"

RPM_NAME = "texlive-pst-knot-2023.209.0.0.2svn16033-53.1.noarch.rpm"
RPM_HASH = "9a370a1ae8ab1c7213cfcba8dcdc0d25314a9f74c56ff73c63dc2123fd496adab85a1ae2770131fbb36a0528118ee7ba6897c9e7b4f4f6ce03a1818c647de755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-knot.sty \
tex-pst-knot.tex \
texlive-pst-knot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
