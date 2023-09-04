SUMMARY = "Package dviout-util"
DESCRIPTION = "The dviout-util package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-dviout-util-2023.209.svn66186-54.2.noarch.rpm"
RPM_HASH = "45e4e8f6111ef53754ed134a12987a80bee45ca4af1a716f3a11e733714c1f8d827e22d6bdd413e5e406d064287f56c9671db684fa5525f185093be1f87dc367"
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
