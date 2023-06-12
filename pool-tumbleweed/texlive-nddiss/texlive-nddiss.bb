SUMMARY = "Notre Dame Dissertation format class"
DESCRIPTION = "This class file conforms to the requirements of the Graduate \
School of the University of Notre Dame; with it a user can \
format a thesis or dissertation in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2017.2svn45107"

RPM_NAME = "texlive-nddiss-2023.201.3.2017.2svn45107-54.1.noarch.rpm"
RPM_HASH = "3dd3d0eda20e45b562714e2130aa59a02c701034e3e459fd06ba85d5d572e9fc2dad052332bb8e8c75e53aa293b0dbf0afdd3dd06f888556b0b8d29941e916f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nddiss2e.cls) \
texlive-nddiss"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(book.cls) \
tex(booktabs.sty) \
tex(color.sty) \
tex(enumerate.sty) \
tex(epsfig.sty) \
tex(etoolbox.sty) \
tex(exscale.sty) \
tex(float.sty) \
tex(graphicx.sty) \
tex(ifluatex.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(ifxetex.sty) \
tex(indentfirst.sty) \
tex(latexsym.sty) \
tex(longtable.sty) \
tex(metalogo.sty) \
tex(natbib.sty) \
tex(pdflscape.sty) \
tex(pdfx.sty) \
tex(rotating.sty) \
tex(setspace.sty) \
tex(tabularx.sty) \
tex(textcase.sty) \
tex(threeparttable.sty) \
tex(threeparttablex.sty) \
tex(url.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
