SUMMARY = "Package dviout-util"
DESCRIPTION = "The dviout-util package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-dviout-util-2023.201.svn66186-53.2.noarch.rpm"
RPM_HASH = "8ac1e0d5f6dcfdfe67e586802a58e5d3e613507edbdaf4b04a76d85f8ee80a0152c512d654cc032d1a62c3c6604f0393fa03a51adaed3ca8ba621801e68a6605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chkdvifont.1 \
man-dvispc.1 \
texlive-dviout-util"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviout-util-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
