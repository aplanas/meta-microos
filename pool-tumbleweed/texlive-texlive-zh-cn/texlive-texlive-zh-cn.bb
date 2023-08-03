SUMMARY = "TeX Live manual (Chinese)"
DESCRIPTION = "The texlive-zh-cn package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54490"

RPM_NAME = "texlive-texlive-zh-cn-2023.209.svn54490-55.1.noarch.rpm"
RPM_HASH = "1785f8431672ff5adfbf9894ba137f4c058f7fa914a11dec69069c1b7130f9658600a0bd7ee7c9c9fbd34c14f7147e7b0123cb1385795ce307cb623011eda66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-zh-cn"

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
