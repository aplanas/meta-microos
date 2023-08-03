SUMMARY = "Exam class for Jinan University"
DESCRIPTION = "The package provides an exam class for Jinan University \
(China)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56867"

RPM_NAME = "texlive-jnuexam-2023.209.1.0svn56867-56.1.noarch.rpm"
RPM_HASH = "36c34e592aded7dccb88af3aac693ee92eb3fab517651bae28c28699b7c4ee9a5067c83516a4b05d54cebca9cdb44394e1c00066525a94ba9bd3026aaef5f1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jnuexam.cls \
texlive-jnuexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKfntef.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-cellspace.sty \
tex-comment.sty \
tex-ctexart.cls \
tex-diagbox.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-everypage.sty \
tex-extarrows.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-lastpage.sty \
tex-mathdesign.sty \
tex-multirow.sty \
tex-pdfpages.sty \
tex-relsize.sty \
tex-tabu.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
