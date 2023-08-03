SUMMARY = "OCR-B fonts in Type 1 and OpenType"
DESCRIPTION = "The package contains OCR-B fonts in Type1 and OpenType formats. \
They were generated from the Metafont sources of the OCR-B \
fonts. The metric files are not included here, so that original \
ocr-b package should also be installed."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20969"

RPM_NAME = "texlive-ocr-b-outline-2023.209.svn20969-55.1.noarch.rpm"
RPM_HASH = "1d3bf410ba83ea039bd909b5a8d67a971e7aeca90088ad4443c40de15516a102aec6e53b4166e50de5d25df8d632cf9818a7a6fd1261fc77ecc12f603bdeea81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocrb.map \
texlive-ocr-b-outline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ocr-b-outline-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
