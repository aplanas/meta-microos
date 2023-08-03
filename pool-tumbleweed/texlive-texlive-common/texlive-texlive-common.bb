SUMMARY = "TeX Live documentation (common elements)"
DESCRIPTION = "The texlive-common package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66324"

RPM_NAME = "texlive-texlive-common-2023.209.svn66324-55.1.noarch.rpm"
RPM_HASH = "a7e76fe4c41d07475c3fb79491de5f9dc65b8a14c2c3e00d5bd0c58c1941a2935daef56729873542af0c532e84521d06256f648377bf90130b4066355c94181a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-common"

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
