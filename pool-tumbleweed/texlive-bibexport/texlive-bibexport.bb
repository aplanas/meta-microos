SUMMARY = "Extract a BibTeX file based on a .aux file"
DESCRIPTION = "A Bourne shell script that uses BibTeX to extract bibliography \
entries that are \\cite'd in a document. It can also expand a \
BibTeX file, expanding the abbreviations (other than the \
built-in ones like month names) and following the \
cross-references."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.03svn50677"

RPM_NAME = "texlive-bibexport-2023.201.3.03svn50677-53.1.noarch.rpm"
RPM_HASH = "941f77b5e66c0a0fb6162589eef2f6565ec62cad1648f03f2d1519df6ebf648e2c3fc7eb5152dca03186d51832ae907d22209046beee63103effef93f320a80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibexport"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibexport-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
