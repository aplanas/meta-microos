SUMMARY = "A Greek-alphabet font"
DESCRIPTION = "Solomos is a font which traces its descent from a \
calligraphically-inspired font of the mid-19th century. LaTeX \
support, for use with the LGR encoding only, is provided."
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn18651"

RPM_NAME = "texlive-gfssolomos-2023.209.1.0svn18651-53.1.noarch.rpm"
RPM_HASH = "e4371ceefb6730d89a049bf0878025ddacd6cb1cc25dddb80bf87c1ef24e16371f8dea5ad44286bfc153b2ce30aeb35948b23c50f7a751f77737d823d2cf08a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfssolomos.map \
tex-gfssolomos.sty \
tex-gpsolomos.enc \
tex-gsolomos8a.tfm \
tex-gsolomos8a.vf \
tex-gsolomos8r.tfm \
tex-lgrsolomos.fd \
texlive-gfssolomos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfssolomos-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
