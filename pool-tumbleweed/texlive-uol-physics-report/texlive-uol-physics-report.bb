SUMMARY = "A LaTeX document class for writing lab reports"
DESCRIPTION = "The package provides physics students at the University of \
Oldenburg with a prepared document class for writing laboratory \
reports for the laboratory courses conducted by the Institute \
of Physics. The document class consists of predefinded margins \
and heading formats. Furthermore, it presets the headers of the \
pages and excludes the titlepage and table of contents from the \
page numbering."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65761"

RPM_NAME = "texlive-uol-physics-report-2023.201.1.1svn65761-53.1.noarch.rpm"
RPM_HASH = "5b1afb5e2b2b8f435f966f93a5878951cfbb687889be9ae42faf2d85e0ea593a085b5f647797df934e166b96c97b98b054e0ae097eb56cd4361076feadec850a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uol-physics-report.cls \
texlive-uol-physics-report"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-arrayjobx.sty \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-circuitikz.sty \
tex-cleveref.sty \
tex-datetime2.sty \
tex-esdiff.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-mathtools.sty \
tex-multido.sty \
tex-parskip.sty \
tex-pdfpages.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tcolorbox.sty \
tex-titleref.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
