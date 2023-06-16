SUMMARY = "Include CMap resources in PDF files from pdfTeX"
DESCRIPTION = "The package is an extension of cmap with improved flexibility \
and coverage, including the ability to re-encode Knuth's basic \
mathematics fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn15878"

RPM_NAME = "texlive-mmap-2023.201.1.03svn15878-54.1.noarch.rpm"
RPM_HASH = "5a6181af9cb65518aa5cf8d049775e4ba47fe74f2874bc1a7bc6911ea0150fe4dc07dd7048deda0f3d247070ba9adc74b97f42c9fd2975b114efad10987881ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mmap.sty \
texlive-mmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmap.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
