SUMMARY = "Compute intersections of arbitrary curves"
DESCRIPTION = "The package computes the intersections between arbitrary \
PostScript paths or Bezier curves, using the Bezier clipping \
algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn33210"

RPM_NAME = "texlive-pst-intersect-2023.209.0.0.4svn33210-53.1.noarch.rpm"
RPM_HASH = "62ecb5bf21194af88813fce6bf58d3e1a34f4d2e4b4dde509d7fcb6aeed504d080de0b72deddfc192cc5a8839b1aee7b104268aef0cb5b14fe5370a399f91445"
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
