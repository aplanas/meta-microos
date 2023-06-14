SUMMARY = "Miscellaneous LaTeX packages, etcetera"
DESCRIPTION = "The ltxmisc package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21927"

RPM_NAME = "texlive-ltxmisc-2023.201.svn21927-52.1.noarch.rpm"
RPM_HASH = "82a38aa897e10da2c3c5f760e43b78a78758cab1a0cdd0713e1b013b6273bdc09ea2cc64206b5a9552ccfa74ea6968d7acc39bace025e2cc869e16bbed793389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abstbook.cls \
tex-beletter.cls \
tex-bibcheck.sty \
tex-concrete.sty \
tex-flashcard.cls \
tex-iagproc.cls \
tex-linsys.sty \
tex-mitpress.sty \
tex-thrmappendix.sty \
tex-topcapt.sty \
tex-vrbexin.sty \
texlive-ltxmisc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-beton.sty \
tex-calc.sty \
tex-euler.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-letter.cls \
tex-makeidx.sty \
tex-minitoc.sty \
tex-natbib.sty \
tex-pifont.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
