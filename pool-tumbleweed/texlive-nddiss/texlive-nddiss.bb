SUMMARY = "Notre Dame Dissertation format class"
DESCRIPTION = "This class file conforms to the requirements of the Graduate \
School of the University of Notre Dame; with it a user can \
format a thesis or dissertation in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2017.2svn45107"

RPM_NAME = "texlive-nddiss-2023.209.3.2017.2svn45107-55.1.noarch.rpm"
RPM_HASH = "f124e4360534ee4e2f2063ffd5030d149e353cead185dbda1c6c0cd5f898d0d6e1a493ed0ae993893aa812c1ecac8c88c8a3c644e313d0e0e08defb2bee9303f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nddiss2e.cls \
texlive-nddiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-book.cls \
tex-booktabs.sty \
tex-color.sty \
tex-enumerate.sty \
tex-epsfig.sty \
tex-etoolbox.sty \
tex-exscale.sty \
tex-float.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-indentfirst.sty \
tex-latexsym.sty \
tex-longtable.sty \
tex-metalogo.sty \
tex-natbib.sty \
tex-pdflscape.sty \
tex-pdfx.sty \
tex-rotating.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textcase.sty \
tex-threeparttable.sty \
tex-threeparttablex.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
