SUMMARY = "Outline version of the mathabx fonts"
DESCRIPTION = "This is an Adobe Type 1 outline version of the mathabx fonts."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn21129"

RPM_NAME = "texlive-mathabx-type1-2023.208.svn21129-53.1.noarch.rpm"
RPM_HASH = "3d3e5aa2665af80e9458f48b2a6e6b393b84479fdf04fd171d2b399b14ac03a0f40c50c367b3cc867c00d98fb5f0048adc3c9e9681bc23d19f4cb4946638c4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathabx.map \
texlive-mathabx-type1"

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
texlive-mathabx \
texlive-mathabx-type1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
