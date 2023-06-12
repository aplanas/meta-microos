SUMMARY = "Harbin Institute of Technology Report LaTeX Template"
DESCRIPTION = "This package provides an assignment and experiment report \
template free of configuration designed for undergraduates on \
the three campuses of Harbin Institute of Technology."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn58357"

RPM_NAME = "texlive-hitreport-2023.201.1.0.0svn58357-53.1.noarch.rpm"
RPM_HASH = "f61658efa83249b37438a0af1ec873cca2cddaf90596d0458e3dedc94acd375e08b3a56f9076dde3cc403512ca44fdf622408c3a02fd4a1646f920894d87e95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hitreport.cls) \
texlive-hitreport"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(appendix.sty) \
tex(array.sty) \
tex(bibunits.sty) \
tex(bigdelim.sty) \
tex(bigstrut.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(cite.sty) \
tex(ctexbook.cls) \
tex(enumitem.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(filehook.sty) \
tex(footmisc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifxetex.sty) \
tex(indentfirst.sty) \
tex(kvdefinekeys.sty) \
tex(kvoptions.sty) \
tex(kvsetkeys.sty) \
tex(listings.sty) \
tex(longtable.sty) \
tex(multirow.sty) \
tex(natbib.sty) \
tex(notoccite.sty) \
tex(pdfpages.sty) \
tex(soul.sty) \
tex(subcaption.sty) \
tex(threeparttable.sty) \
tex(tikz.sty) \
tex(titletoc.sty) \
tex(ulem.sty) \
tex(unicode-math.sty) \
tex(url.sty) \
tex(xcolor.sty) \
tex(xeCJKfntef.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
