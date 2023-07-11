SUMMARY = "Summary of mathematical symbols available in LaTeX"
DESCRIPTION = "A predecessor of the comprehensive symbols list, covering \
mathematical symbols available in standard LaTeX (including the \
AMS symbols, if available at compile time)."
LICENSE = "LPPL-1.0"

PV = "2023.208.3.4svn37763"

RPM_NAME = "texlive-maths-symbols-2023.208.3.4svn37763-53.1.noarch.rpm"
RPM_HASH = "c2ef636432897a8d98423cbc3fc9bcd15d0a6f114fb05ae1318f6d37af6992508448b096c6295b33e8e37fd8228ff27d442bfb5019f59ba0ecd0c202ff30f5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maths-symbols"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
