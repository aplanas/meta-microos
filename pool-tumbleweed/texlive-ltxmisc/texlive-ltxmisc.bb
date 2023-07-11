SUMMARY = "Miscellaneous LaTeX packages, etcetera"
DESCRIPTION = "The ltxmisc package"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn21927"

RPM_NAME = "texlive-ltxmisc-2023.208.svn21927-53.1.noarch.rpm"
RPM_HASH = "ce6c6ac502a5365646f41755b2cac1cb7b6eefc3bfd59b5a6881dd08ebfe0e235f89eb85cb2d3e03f7160d7c40d6c135ec5eac45fbef6af7f73c4dc271e8868b"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
