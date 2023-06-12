SUMMARY = "Templates for the Beijing Institute of Technology"
DESCRIPTION = "This package establishes a simple and easy-to-use LaTeX \
template for Beijing Institute of Technology dissertations, \
including general undergraduate theses and master theses."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4.2svn66366"

RPM_NAME = "texlive-bithesis-2023.201.3.4.2svn66366-52.1.noarch.rpm"
RPM_HASH = "72f34f81315d0f5fea04de2fc447dffcc4bada3f246bcce16cce423e2056a2196b91da04b81381c2e2740f75bf2588182f98ce8219f1ab4c6d8b1e2d94cf1b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bitart.cls) \
tex(bitbeamer.cls) \
tex(bitbook.cls) \
tex(bitgrad.cls) \
tex(bithesis.cls) \
tex(bitreport.cls) \
texlive-bithesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(array.sty) \
tex(biblatex.sty) \
tex(bm.sty) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(ctexart.cls) \
tex(ctexbeamer.cls) \
tex(ctexbook.cls) \
tex(datetime2.sty) \
tex(dcolumn.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(fmtcount.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(indentfirst.sty) \
tex(kvoptions.sty) \
tex(l3keys2e.sty) \
tex(listings.sty) \
tex(mathrsfs.sty) \
tex(mhchem.sty) \
tex(multirow.sty) \
tex(pdfpages.sty) \
tex(pifont.sty) \
tex(setspace.sty) \
tex(siunitx.sty) \
tex(subfigure.sty) \
tex(threeparttable.sty) \
tex(tikz.sty) \
tex(titlesec.sty) \
tex(titletoc.sty) \
tex(unicode-math.sty) \
tex(upgreek.sty) \
tex(wrapfig.sty) \
tex(xcolor.sty) \
tex(xeCJK.sty) \
tex(xeCJKfntef.sty) \
tex(xltxtra.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
