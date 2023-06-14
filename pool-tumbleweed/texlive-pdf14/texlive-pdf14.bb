SUMMARY = "Restore PDF 1.4 to a TeX live 2010 format"
DESCRIPTION = "Starting with TeX Live 2010, the various formats, that directly \
generate PDF, default to generating PDF 1.5. This is generally \
a good thing, but it can lead to compatibility issues with some \
older PDF viewers. This package changes the version of PDF \
generated with formats (based on pdfTeX or LuaTeX in PDF mode), \
back to 1.4 for documents that need to achieve maximal \
compatibility with old viewers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn17583"

RPM_NAME = "texlive-pdf14-2023.201.0.0.1svn17583-51.1.noarch.rpm"
RPM_HASH = "b73d69d6cc117f6eda0391042d3726b5c550610c8a7d262f7c75dfda1424336c7a8ec7683af2f7885dc592f623b5016d5e6e3e40353dabf4b1a32a615ad0e661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdf14.sty \
texlive-pdf14"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
