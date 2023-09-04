SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-2023.209.20230223svn66115-54.2.noarch.rpm"
RPM_HASH = "72abe6ab683f59329745e0be56aa31a936d742c6facee9045feb8a8e4721e00e19f53616beda2e1eeb4e96ff6fd12e54559084b4f54dd635c1e8836bbd351cdd"
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
