SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-2023.201.20230223svn66115-53.2.noarch.rpm"
RPM_HASH = "e71ce9a2287da7ef3cd730cecbcc73adbd1f7cb2f7f8d571af007094b8513645fcef846b529378a962c839065d4bb04217778d674eb1c0c8f4585083f6130173"
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
