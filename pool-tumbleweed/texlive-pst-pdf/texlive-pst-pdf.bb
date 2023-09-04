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

RPM_NAME = "texlive-pst-pdf-2023.209.1.2fsvn56622-54.2.noarch.rpm"
RPM_HASH = "c06c090848e49ced6d964ac8d04a4f0e6fe2ab7f3d162b00fe3bb23249069321365b3b5774d955bb1a20a3f685e9308531c456c206e547363b0ecbd975c8cdac"
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
