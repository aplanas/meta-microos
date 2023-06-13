SUMMARY = "Annotate PDF files with margin notes"
DESCRIPTION = "This package lets you add comments in the page margins of PDF \
files, e.g. when reviewing manuscripts or grading reports. The \
PDF file to be annotated is included, one page at a time, as \
graphics, in a manner similar to the pdfpages package. Notes \
are placed in the margin next to the included graphics using a \
grid of help lines. Alternatively, only numbers are placed in \
the page margins, and the notes are collected into a numbered \
list at the end of the document. Note that this package is not \
intended for adding notes directly to the LaTeX source of the \
document that is being reviewed; instead, the document \
undergoing review is already in PDF format and remains \
unchanged. Also note that this package does not produce the \
usual PDF 'sticky notes' that must be opened by clicking on \
them; instead, the notes are simply shown as text. This package \
depends on the following other LaTeX package: adjustbox, calc, \
geometry, graphicx, grffile, ifthen, kvoptions, tikz, ulem, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn50100"

RPM_NAME = "texlive-pdfreview-2023.201.1.2svn50100-51.1.noarch.rpm"
RPM_HASH = "67d217245975f50bfd20919ebb1f165ac3aeac4b8b5f41e43514b443b870821898904ded56ca1174bc939c1f10c86fd0e2cbbe7d5f025c0c8ea349c633e45860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfreview.sty) \
texlive-pdfreview"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bookmark.sty) \
tex(geometry.sty) \
tex(grffile.sty) \
tex(hyperref.sty) \
tex(ulem.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
