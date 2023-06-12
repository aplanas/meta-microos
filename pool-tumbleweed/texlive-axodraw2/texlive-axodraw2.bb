SUMMARY = "Feynman diagrams in a LaTeX document"
DESCRIPTION = "This package defines macros for drawing Feynman graphs in LaTeX \
documents. It is an important update of the axodraw package, \
but since it is not completely backwards compatible, we have \
given the style file a changed name. Many new features have \
been added, with new types of line, and much more flexibility \
in their properties. In addition, it is now possible to use \
axodraw2 with pdfLaTeX, as well as with the LaTeX-dvips method. \
However with pdfLaTeX (and also LuaLaTeX and XeLaTeX), an \
external program, axohelp, is used to perform the geometrical \
calculations needed for the pdf code inserted in the output \
file. The processing involves a run of pdfLaTeX, a run of \
axohelp, and then another run of pdfLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1.1csvn58155"

RPM_NAME = "texlive-axodraw2-2023.201.2.1.1csvn58155-53.1.noarch.rpm"
RPM_HASH = "189429dd793e7697452821f9173e622e88e3f7abf29fae1512622e3664f9243d19ed48c1e7c5ab2a225c4a245de12712a279c26e5a62b0158101a5c6222489e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(axodraw2.sty) \
texlive-axodraw2"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(ifxetex.sty) \
tex(keyval.sty) \
texlive \
texlive-axodraw2-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
