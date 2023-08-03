SUMMARY = "Restore PDF 1.4 to a TeX live 2010 format"
DESCRIPTION = "Starting with TeX Live 2010, the various formats, that directly \
generate PDF, default to generating PDF 1.5. This is generally \
a good thing, but it can lead to compatibility issues with some \
older PDF viewers. This package changes the version of PDF \
generated with formats (based on pdfTeX or LuaTeX in PDF mode), \
back to 1.4 for documents that need to achieve maximal \
compatibility with old viewers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn17583"

RPM_NAME = "texlive-pdf14-2023.209.0.0.1svn17583-52.1.noarch.rpm"
RPM_HASH = "9ee52e1f27c66ae842e064511254cb29e115301eca5dbdba28f9139e7e373be51ffb92deddf813e74f6089d18f2b2bc65bd3644d6884e686ef0ba54a2e858cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdf14.sty \
texlive-pdf14"

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
