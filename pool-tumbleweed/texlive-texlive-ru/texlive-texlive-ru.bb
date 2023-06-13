SUMMARY = "TeX Live manual (Russian)"
DESCRIPTION = "The texlive-ru package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58426"

RPM_NAME = "texlive-texlive-ru-2023.201.svn58426-54.1.noarch.rpm"
RPM_HASH = "c150ab7da3ddc7d9ab50731692c0d1b010450841e85f62b01d869d3631ec1186df51fbbdd9012e5d0a30c9da185b4cd8b10b3057275f1ac269c07efbcfb8f50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-ru"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
