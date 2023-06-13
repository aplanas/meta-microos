SUMMARY = "Exam class for Jinan University"
DESCRIPTION = "The package provides an exam class for Jinan University \
(China)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56867"

RPM_NAME = "texlive-jnuexam-2023.201.1.0svn56867-55.1.noarch.rpm"
RPM_HASH = "9afa471fa32000af5ad11c906e9c712e973e823cae7f855ee7f6a057ac684a74a209c898ae1882bbaccc5a55de17480359b5275f7553a4629024168c77ab8f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jnuexam.cls) \
texlive-jnuexam"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(CJKfntef.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(calc.sty) \
tex(cellspace.sty) \
tex(comment.sty) \
tex(ctexart.cls) \
tex(diagbox.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(everypage.sty) \
tex(extarrows.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(lastpage.sty) \
tex(mathdesign.sty) \
tex(multirow.sty) \
tex(pdfpages.sty) \
tex(relsize.sty) \
tex(tabu.sty) \
tex(tabularx.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(zref-savepos.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
