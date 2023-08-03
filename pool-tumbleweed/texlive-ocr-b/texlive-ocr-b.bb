SUMMARY = "Fonts for OCR-B"
DESCRIPTION = "Metafont source for OCR-B at several sizes."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20852"

RPM_NAME = "texlive-ocr-b-2023.209.svn20852-55.1.noarch.rpm"
RPM_HASH = "e0c4219b04b6d87f7f305a9cce175bc442dfdc4313524de8c9510991aca6bd6ff217a181e825869092ad53564b9cb95b2e5e9e52753e7b4c610e43dc4d9a4e73"
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
