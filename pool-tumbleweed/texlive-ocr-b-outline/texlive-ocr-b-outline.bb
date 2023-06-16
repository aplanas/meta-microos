SUMMARY = "OCR-B fonts in Type 1 and OpenType"
DESCRIPTION = "The package contains OCR-B fonts in Type1 and OpenType formats. \
They were generated from the Metafont sources of the OCR-B \
fonts. The metric files are not included here, so that original \
ocr-b package should also be installed."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20969"

RPM_NAME = "texlive-ocr-b-outline-2023.201.svn20969-54.1.noarch.rpm"
RPM_HASH = "d9f5393be0623c8cd963fdb0f84042d7d4939ad0e606b39148229bc1571f917f93f181fc5c133d84304faba680fd20ba4def6c4b33405164669f2364d4bb39d8"
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
