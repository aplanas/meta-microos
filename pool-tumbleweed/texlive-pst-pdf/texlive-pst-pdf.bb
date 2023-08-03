SUMMARY = "Make PDF versions of graphics by processing between runs"
DESCRIPTION = "The package pst-pdf simplifies the use of graphics from \
PSTricks and other PostScript code in PDF documents. As in \
building a bibliography with BibTeX, additional external \
programmes are invoked. In this case they are used to create a \
PDF file (\\PDFcontainer) that will contain all the graphics \
material. In the final document these contents will be inserted \
instead of the original PostScript code. The package works with \
pstricks and requires a recent version of the preview package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2fsvn56622"

RPM_NAME = "texlive-pst-pdf-2023.209.1.2fsvn56622-54.1.noarch.rpm"
RPM_HASH = "dd7728151cd221bda3b86c1b9e28478a2007092c8c43ba530fbfe215a886957bf2b381737022122e4fa525d0c8144fb38039d2d6418f751ae0cc539cb66d5786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pdf.sty \
texlive-pst-pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-luatex85.sty \
tex-preview.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pst-pdf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
