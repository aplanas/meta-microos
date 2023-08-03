SUMMARY = "TeX Live manual (Spanish)"
DESCRIPTION = "The texlive-es package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66059"

RPM_NAME = "texlive-texlive-es-2023.209.svn66059-55.1.noarch.rpm"
RPM_HASH = "a34a59fb0d6eb5c4a8cfe84fecfc2c20ab0896e29ac929439b9a43005a869d15c6ed61d1c5a1e747672b8861d795f770fc37eba4adf6dd2a8c9f088760f6c02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-es"

RDEPENDS:${PN} += "/usr/bin/sh \
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
