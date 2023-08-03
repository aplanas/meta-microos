SUMMARY = "A LaTeX document class for writing lab reports"
DESCRIPTION = "The package provides physics students at the University of \
Oldenburg with a prepared document class for writing laboratory \
reports for the laboratory courses conducted by the Institute \
of Physics. The document class consists of predefinded margins \
and heading formats. Furthermore, it presets the headers of the \
pages and excludes the titlepage and table of contents from the \
page numbering."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65761"

RPM_NAME = "texlive-uol-physics-report-2023.209.1.1svn65761-54.1.noarch.rpm"
RPM_HASH = "b416ba1ba82e5ff136e838014c8be3a9ba8b2638d749a6325f44b2b762535f8f2f841b6b5f238018fcadac9a49ba464854fcf18f6321dbad3c4a37c2585d45c4"
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
