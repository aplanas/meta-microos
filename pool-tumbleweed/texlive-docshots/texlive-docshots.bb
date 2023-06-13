SUMMARY = "TeX samples next to their PDF Snapshots"
DESCRIPTION = "This LaTeX package helps you show TeX code next to the \
corresponding PDF snapshots, in two-column formatting. You can \
use it either in .dtx documentation or in .tex files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn65141"

RPM_NAME = "texlive-docshots-2023.201.0.0.4.0svn65141-52.1.noarch.rpm"
RPM_HASH = "e73dcb3ac29db379e061cd9aa49ef1b574bda85af3866d8d4250f949656eacc82040e87802afa282dbac02c16d991b0447a4793261747c660e6e361303ed440d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(docshots.sty) \
texlive-docshots"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancyvrb.sty) \
tex(graphicx.sty) \
tex(iexec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(pdftexcmds.sty) \
tex(pgfopts.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-fancyvrb \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfcrop \
texlive-pgf \
texlive-pgf-blur \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
