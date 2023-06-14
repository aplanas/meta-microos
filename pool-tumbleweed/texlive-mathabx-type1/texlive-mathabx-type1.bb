SUMMARY = "Outline version of the mathabx fonts"
DESCRIPTION = "This is an Adobe Type 1 outline version of the mathabx fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21129"

RPM_NAME = "texlive-mathabx-type1-2023.201.svn21129-52.1.noarch.rpm"
RPM_HASH = "688abd26f3ede55cfa55c72ba1f598d3285ca59e95b958a90b84593711b8bdac7cf231832159b6fa8b77f5707a1cdf2edd51111b061d1210b50e708e01e9c463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathabx.map \
texlive-mathabx-type1"

RDEPENDS:${PN} += "/bin/sh \
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
