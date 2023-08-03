SUMMARY = "Create n-up PDF pages with minimal margins"
DESCRIPTION = "pdfxup is a Unix/Linux shell script that creates a PDF document \
where each page is obtained by combining several pages of a PDF \
file given as output. pdfxup uses ghostscript for computing the \
maximal bounding box of (some of) the pages of the document, \
and then uses pdflatex (with the graphicx package) in order to \
produce the new document."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.10svn59001"

RPM_NAME = "texlive-pdfxup-2023.209.2.10svn59001-52.1.noarch.rpm"
RPM_HASH = "ed9192b2bf7ea00b38a74d6e1d45f753f8a610e346d37fcb487634efdd47227b6da1d0af2fcadb8f79722b1faa95c25a5df1ec03338ee5d1efc1e8999d66158b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfxup-template.tex \
texlive-pdfxup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
