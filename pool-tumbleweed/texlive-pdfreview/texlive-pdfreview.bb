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

PV = "2023.209.1.2svn50100"

RPM_NAME = "texlive-pdfreview-2023.209.1.2svn50100-52.1.noarch.rpm"
RPM_HASH = "2c0611d8c1a2c15008f1050b9fd889578781abda8443c9e89366fa5131e5c076335531969d21b5f65fd4bcde62c38e327079d602f81fec47b795014f6fdc0cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfreview.sty \
texlive-pdfreview"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-geometry.sty \
tex-grffile.sty \
tex-hyperref.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
