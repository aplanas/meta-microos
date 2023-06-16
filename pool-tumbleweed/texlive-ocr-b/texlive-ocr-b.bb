SUMMARY = "Fonts for OCR-B"
DESCRIPTION = "Metafont source for OCR-B at several sizes."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20852"

RPM_NAME = "texlive-ocr-b-2023.201.svn20852-54.1.noarch.rpm"
RPM_HASH = "85f64381b7f84916e7d15397bf9360792c750adf998ae23c109fd5de02400b19810bdc9808d5af619ecc18a3db3cf39df0c8c931683547def118d55f6f79bc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocrb10.tfm \
tex-ocrb5.tfm \
tex-ocrb6.tfm \
tex-ocrb7.tfm \
tex-ocrb8.tfm \
tex-ocrb9.tfm \
texlive-ocr-b"

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
