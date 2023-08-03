SUMMARY = "TeX Live manual (Czech/Slovak)"
DESCRIPTION = "The texlive-cz package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62854"

RPM_NAME = "texlive-texlive-cz-2023.209.svn62854-55.1.noarch.rpm"
RPM_HASH = "4bd8c0760be77ddffcf78568a1633d2b85d043f4f49baf02d7818b094b65153fefa3ae1d11690dfec3f80f3090610ae29756a6896404d7bb84a81024d58feb4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-cz"

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
