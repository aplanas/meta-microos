SUMMARY = "Type 1 version of 'skt' fonts for Sanskrit"
DESCRIPTION = "The sanskrit-t1 font package provides Type 1 version of Charles \
Wikner's skt font series for the Sanskrit language."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-sanskrit-t1-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "7009649ecc5a50ed992cf36ef6e1a2d1744e8e40a58592169268c908c8d27d5eea6ec9140b97651ff89eda1a604b486fb127b639ee5fe8636932bd1d819a023e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skt.map \
texlive-sanskrit-t1"

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
texlive-sanskrit-t1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
