SUMMARY = "Classes for formatting federal grant proposals"
DESCRIPTION = "LaTeX classes for formatting federal grant proposals: grant: \
Base class for formatting grant proposals grant-arl: Army \
Research Laboratory grant-darpa: Defense Advanced Research \
Projects Agency grant-doe: Department of Energy grant-nih: \
National Institutes of Health grant-nrl: Naval Research \
Laboratory grant-nsf: National Science Foundation grant-onr: \
Office of Naval Research"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-2023.201.0.0.0.5svn56852-53.2.noarch.rpm"
RPM_HASH = "d1604e4a9feee22431c3387a0f5dfb393a02a82984224487959ba0e54ea116a425dc0315fe817d2946e18b2c430574ea2d0df04214781e34cff2348f56b9feb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grant-afosr.cls \
tex-grant-aro.cls \
tex-grant-darpa.cls \
tex-grant-doe.cls \
tex-grant-nih.cls \
tex-grant-nrl.cls \
tex-grant-nsf.cls \
tex-grant-onr.cls \
tex-grant.cls \
texlive-grant"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-chappg.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-ltxtable.sty \
tex-multicol.sty \
tex-paralist.sty \
tex-pdfcomment.sty \
tex-pdfpages.sty \
tex-placeins.sty \
tex-setspace.sty \
tex-soul.sty \
tex-tabularx.sty \
tex-times.sty \
tex-titlesec.sty \
tex-ulem.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
