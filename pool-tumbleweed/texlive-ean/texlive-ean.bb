SUMMARY = "Macros for making EAN barcodes"
DESCRIPTION = "Provides EAN-8 and EAN-13 forms. The package needs the ocr-b \
fonts; note that the fonts are not available under a free \
licence, as the macros are."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn20851"

RPM_NAME = "texlive-ean-2023.209.svn20851-54.2.noarch.rpm"
RPM_HASH = "5bca6380db83bc2e9d8a8f6ef78dc62256cc96160b06dbc32e58c050cd2575c2d9d1ea769a584c918d58936047684416cf60902cff07235c544f9fc34c70c342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ean13.tex \
tex-ean8.tex \
texlive-ean"

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
