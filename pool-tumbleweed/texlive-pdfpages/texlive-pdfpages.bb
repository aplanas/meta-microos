SUMMARY = "Include PDF documents in LaTeX"
DESCRIPTION = "This package simplifies the inclusion of external multi-page \
PDF documents in LaTeX documents. Pages may be freely selected \
and similar to psnup it is possible to put several logical \
pages onto each sheet of paper. Furthermore a lot of hypertext \
features like hyperlinks and article threads are provided. The \
package supports pdfTeX (pdfLaTeX) and VTeX. With VTeX it is \
even possible to use this package to insert PostScript files, \
in addition to PDF files."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5xsvn65319"

RPM_NAME = "texlive-pdfpages-2023.209.0.0.5xsvn65319-52.1.noarch.rpm"
RPM_HASH = "c45d9adf678d7c36dc7270b1bbe0c4e9b00cf922701ed3552442e3fe97ca97fb5f0402658a6a6948b8b657aae85d835325cabfdfbd6a5dc938042aebf49ede6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpages.sty \
tex-ppdvipdfmx.def \
tex-ppdvips.def \
tex-ppluatex.def \
tex-ppnull.def \
tex-pppdftex.def \
tex-ppvtex.def \
tex-ppxetex.def \
texlive-pdfpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-count1to.sty \
tex-dvipdfmx.def \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-pdflscape.sty \
texlive \
texlive-eso-pic \
texlive-filesystem \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm
