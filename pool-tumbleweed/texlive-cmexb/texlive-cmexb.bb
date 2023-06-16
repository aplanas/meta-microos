SUMMARY = "Cmexb10 metrics and Type 1"
DESCRIPTION = "Computer Modern Math Extension bold, metrics and .pfb file. \
Made by Petr Olsak via autotracing."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-cmexb-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "1ab43542f614167f34d24408c9d73d8a22eb9205f289c118b7b867699e81f085a29f0cdde5de4ac3087235079fb1791116c05666e39df874c3145967bb9c0f6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmexb.map \
tex-cmexb10.tfm \
texlive-cmexb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cmexb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
