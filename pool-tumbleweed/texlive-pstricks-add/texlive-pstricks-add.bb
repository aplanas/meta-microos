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

PV = "2023.209.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-2023.209.3.93svn65067-54.1.noarch.rpm"
RPM_HASH = "c376256835e7a319471c9d4e9b3a731ee90ca6813044e5180e7c66dcc1688f318f2b3b209284e1ba02940210d58677fbc5200800fc8e98eb3c0c1e7ab35282e6"
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
