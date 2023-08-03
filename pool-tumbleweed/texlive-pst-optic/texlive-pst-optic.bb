SUMMARY = "Drawing optics diagrams"
DESCRIPTION = "A package for drawing both reflective and refractive optics \
diagrams. The package requires pstricks later than version \
1.10."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn62977"

RPM_NAME = "texlive-pst-optic-2023.209.1.02svn62977-53.1.noarch.rpm"
RPM_HASH = "0fd92d035e838633d036eeac583123fe2aec49ce5380c5f7c1699fe546d7ead05efba47a40729f0c4053388366a65c474e4e301e980102b839e8483588fdb696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-optic.sty \
tex-pst-optic.tex \
texlive-pst-optic"

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
