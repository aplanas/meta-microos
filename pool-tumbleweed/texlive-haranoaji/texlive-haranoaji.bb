SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-2023.209.20230223svn66115-54.2.noarch.rpm"
RPM_HASH = "39b6496e98ce3f7af8732e29f7e950f5e47e845dd66cd5e30d6838343a1756a870197972de49a074971997989f10c7cf2868bcbec96f63e55754083cf8498d19"
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
