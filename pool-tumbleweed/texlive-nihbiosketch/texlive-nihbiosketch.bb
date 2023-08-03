SUMMARY = "A class for NIH biosketches based on the 2015 updated format"
DESCRIPTION = "This LaTeX document class tries to adhere to the Biographical \
Sketch formatting requirements outlined in NIH Notice \
[NOT-OD-15-032] \
(grants.nih.gov/grants/guide/notice-files/NOT-OD-15-032.html). \
This new format is required for applications submitted for due \
dates on or after May 25, 2015. The package tries to mimic the \
example documents provided on the [SF 424 (R&R) Forms and \
Applications page] \
(grants.nih.gov/grants/funding/424/index.htm#format) as closely \
as possible. The author has used this class for his own grant \
submissions; however he offers no guarantee of conformity to \
NIH requirements."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54191"

RPM_NAME = "texlive-nihbiosketch-2023.209.svn54191-55.1.noarch.rpm"
RPM_HASH = "2326028de74dac54a2e45923bf26c91c55ba7f293e0d9a732ac2ddc84ef78ef0bc50809833db49ecb53c82c89a2288e3a4c53b22fd3216c5e7f3ad753d1521b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nihbiosketch.cls \
texlive-nihbiosketch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-microtype.sty \
tex-tabu.sty \
tex-titlesec.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
