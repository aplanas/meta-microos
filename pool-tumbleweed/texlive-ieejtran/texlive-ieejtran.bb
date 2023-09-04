SUMMARY = "Unofficial bibliography style file for the Institute of Electrical Engineers of Japan"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors of \
the Institute of Electrical Engineers of Japan (IEEJ) \
transactions journals and conferences."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn65641"

RPM_NAME = "texlive-ieejtran-2023.209.0.0.19svn65641-54.1.noarch.rpm"
RPM_HASH = "87b2a1defe21deb1ed8d33f847996a4c23af3d1ec56f5304c46932a9e060389b46fb5866c48ff0f84bcca4d3c02d6bde63b0c7b242bda57e52eb3af74e24b5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieejtran"

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
