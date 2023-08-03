SUMMARY = "Macros for making EAN barcodes"
DESCRIPTION = "Provides EAN-8 and EAN-13 forms. The package needs the ocr-b \
fonts; note that the fonts are not available under a free \
licence, as the macros are."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn20851"

RPM_NAME = "texlive-ean-2023.209.svn20851-54.1.noarch.rpm"
RPM_HASH = "be4111a506bf354402c0f0b9fb16ea5f968f543a5b89224e5c553a347b83efd1189f02f783dcb4f4d28de7d032c292dd58eb326dcb43790f7b7b5d33e37ff70d"
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
