SUMMARY = "Extract source file or stream from PDF file"
DESCRIPTION = "Extracts an embedded source file, or extracts and uncompresses \
a PDF stream given by object number. Developed as part of the \
pdfTeX source tree."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-pdftosrc-2023.201.svn66186-51.1.noarch.rpm"
RPM_HASH = "9bed1886a32419c7904e8462f608e35adb891064d7921c1bbb8147b0e08f742cce40f3063c854600c859c3994d59759ca18502874f4254d3f5502f4f90594c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdftosrc.1 \
texlive-pdftools-doc-/usr/share/man/man1/pdftosrc.1.gz \
texlive-pdftosrc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftosrc-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
