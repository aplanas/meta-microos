SUMMARY = "A PSTricks package to draw geometric tools"
DESCRIPTION = "This PSTricks package facilitates the drawing of protractors, \
rulers, compasses and pencils."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61430"

RPM_NAME = "texlive-pst-geometrictools-2023.209.1.3svn61430-53.1.noarch.rpm"
RPM_HASH = "4c04bf1253908e0d107f9debd2f962ffd1053ac215a061663f40118cd4594b1c3f1bea3fd1a1a62ca02610e3450d0cacf52e02c78adc30bb4867b23cbcfcbcfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-geometrictools.sty \
tex-pst-geometrictools.tex \
texlive-pst-geometrictools"

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
