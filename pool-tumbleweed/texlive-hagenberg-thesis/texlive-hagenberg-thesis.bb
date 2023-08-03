SUMMARY = "Collection of LaTeX classes, style files and example documents for academic manuscripts"
DESCRIPTION = "A collection of modern LaTeX classes, style files and example \
documents for authoring Bachelor, Master or Diploma theses and \
related academic manuscripts in English and German. Includes \
comprehensive tutorials (in English and German) with detailed \
instructions and authoring guidelines."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65819"

RPM_NAME = "texlive-hagenberg-thesis-2023.209.svn65819-54.1.noarch.rpm"
RPM_HASH = "9f303d4925166cfb70d42168ec411fad10bafd44ff059f50bf55d6ff0555ee494cc7baa2ad64da69e4d8625de558c5ab6fcf4b1045e594a20e455dc00b89de4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hgb.sty \
tex-hgbabbrev.sty \
tex-hgbalgo.sty \
tex-hgbarticle.cls \
tex-hgbbib.sty \
tex-hgbheadings.sty \
tex-hgblistings.sty \
tex-hgbmath.sty \
tex-hgbreport.cls \
tex-hgbthesis.cls \
texlive-hagenberg-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-algorithm.sty \
tex-algpseudocodex.sty \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-babel.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-breakurl.sty \
tex-calc.sty \
tex-caption.sty \
tex-cmap.sty \
tex-csquotes.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-epstopdf.sty \
tex-eurosym.sty \
tex-exscale.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-inputenc.sty \
tex-lengthconvert.sty \
tex-listingsutf8.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-moreverb.sty \
tex-multirow.sty \
tex-overpic.sty \
tex-pdfpages.sty \
tex-pict2e.sty \
tex-report.cls \
tex-subdepth.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbasic.sty \
tex-upquote.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
