SUMMARY = "Extract source file or stream from PDF file"
DESCRIPTION = "Extracts an embedded source file, or extracts and uncompresses \
a PDF stream given by object number. Developed as part of the \
pdfTeX source tree."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-pdftosrc-2023.209.svn66186-52.1.noarch.rpm"
RPM_HASH = "ecca8a3d60bd1918369f8ea3cac20b185259e02fb3eb0828d8b59a00f938df619c67d4d1ac2aa531ac728673e3727e51d501f31fa2d4d86a372480eadfa73cdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdftosrc.1 \
texlive-pdftools-doc-/usr/share/man/man1/pdftosrc.1.gz \
texlive-pdftosrc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
