SUMMARY = "TeX support (from CJK) for the norasi font"
DESCRIPTION = "The norasi-c90 package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60831"

RPM_NAME = "texlive-norasi-c90-2023.209.svn60831-55.1.noarch.rpm"
RPM_HASH = "b790ba6d7c857039883e6eac1e57c1e666e79730740d24201416994ac8dc94644f3f0ea8d1c4a7f727dd17a1238443470b57d13c9ae9d6f913b040489ece6674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftnb8z.tfm \
tex-ftnbi8z.tfm \
tex-ftni8z.tfm \
tex-ftnr8z.tfm \
tex-norasi-c90.map \
texlive-norasi-c90"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fonts-tlwg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
