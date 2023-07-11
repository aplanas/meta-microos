SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-2023.201.20230223svn66115-53.2.noarch.rpm"
RPM_HASH = "d8d1c0d7c39176f39ad8f9cac21670e7034a12390b01e186ffa3f573ba4ad833a1e1ebaa417ce40b90dbf2b414c36764337927aeaee568d293ce95157d4f051d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-texmf.cnf \
texlive \
texlive-filesystem \
texlive-haranoaji-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
