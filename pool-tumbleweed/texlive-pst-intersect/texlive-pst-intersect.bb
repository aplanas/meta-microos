SUMMARY = "Compute intersections of arbitrary curves"
DESCRIPTION = "The package computes the intersections between arbitrary \
PostScript paths or Bezier curves, using the Bezier clipping \
algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn33210"

RPM_NAME = "texlive-pst-intersect-2023.201.0.0.4svn33210-52.1.noarch.rpm"
RPM_HASH = "e480dfa16efe6d4fc782edab2eb371fa86902a675420728db6324cacb67fff6e00e8cd7b88a01363b1c14ae7f76f4a52f4003c20d31b040bfd1a6696dfa48adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-intersect.sty \
tex-pst-intersect.tex \
texlive-pst-intersect"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-func.sty \
tex-pst-node.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
