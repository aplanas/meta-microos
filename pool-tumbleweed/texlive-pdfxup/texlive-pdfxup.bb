SUMMARY = "Create n-up PDF pages with minimal margins"
DESCRIPTION = "pdfxup is a Unix/Linux shell script that creates a PDF document \
where each page is obtained by combining several pages of a PDF \
file given as output. pdfxup uses ghostscript for computing the \
maximal bounding box of (some of) the pages of the document, \
and then uses pdflatex (with the graphicx package) in order to \
produce the new document."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.10svn59001"

RPM_NAME = "texlive-pdfxup-2023.201.2.10svn59001-51.1.noarch.rpm"
RPM_HASH = "7f11ceec9d9dc5728dd295aeae60782ed4385b0ace2d319aac5c362f465bb95ddf6a42ff9681fd3a2d4fd8c0698ebc56f86d9f5f206ac5bbca4fcc5aa783e138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfxup-template.tex) \
texlive-pdfxup"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfxup-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
