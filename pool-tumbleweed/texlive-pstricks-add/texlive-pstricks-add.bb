SUMMARY = "A collection of add-ons and bugfixes for PSTricks"
DESCRIPTION = "Collects together examples that have been posted to the \
PSTricks mailing list, together with many additional features \
for the basic pstricks, pst-plot and pst-node, including: \
bugfixes; new options for the pspicture environment; arrows; \
braces as node connection/linestyle; extended axes for plots \
(e.g., logarithm axes); polar plots; plotting tangent lines of \
curves or functions; solving and printing differential \
equations; box plots; matrix plots; and pie charts. The package \
makes use of PostScript routines provided by pst-math."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-2023.201.3.93svn65067-53.2.noarch.rpm"
RPM_HASH = "fd91bfee58ff44bd4c8c6782f72a1232b28765987280ad910fa2d7b9cb11c8ce5f2b3a7a41458cae74234977c9c9d5357fee97fd4caf9d873ebade4138aa9848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstricks-add.sty \
tex-pstricks-add.tex \
texlive-pstricks-add"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-calculate.sty \
tex-pst-math.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
