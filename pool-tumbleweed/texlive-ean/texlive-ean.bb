SUMMARY = "Macros for making EAN barcodes"
DESCRIPTION = "Provides EAN-8 and EAN-13 forms. The package needs the ocr-b \
fonts; note that the fonts are not available under a free \
licence, as the macros are."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn20851"

RPM_NAME = "texlive-ean-2023.201.svn20851-53.2.noarch.rpm"
RPM_HASH = "50b1f4c9b45dbf63e2305921fd0d133d86d6374a324eb099957c28086f8ab8f6144e143075347f8e863086a35b68e8395ba3572c3606b0a22021489cba184370"
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
