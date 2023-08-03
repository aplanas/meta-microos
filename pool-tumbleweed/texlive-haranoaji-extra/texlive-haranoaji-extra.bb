SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-2023.209.20230223svn66115-54.1.noarch.rpm"
RPM_HASH = "4a33a076a913fff5d772a81b40f30f1a07f005428f1093aa7456d0bbc54982c54f79070d4fe785468b83d8b9eb2c9283942a8205a3f1a9ae4e2ff9bb5922c403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-haranoaji-extra-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
