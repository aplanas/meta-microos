SUMMARY = "Macros for making EAN barcodes"
DESCRIPTION = "Provides EAN-8 and EAN-13 forms. The package needs the ocr-b \
fonts; note that the fonts are not available under a free \
licence, as the macros are."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn20851"

RPM_NAME = "texlive-ean-2023.201.svn20851-53.1.noarch.rpm"
RPM_HASH = "42de027dde68a6230fb44f414c0285301ac207849870600913c478fa3d2e5e10fc8a7aea9de3ccfcedbb557d3f98af27233ae39d34f1414cddfdb41091b950eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ean13.tex \
tex-ean8.tex \
texlive-ean"

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
