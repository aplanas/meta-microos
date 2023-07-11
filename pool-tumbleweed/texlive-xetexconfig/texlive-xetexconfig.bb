SUMMARY = "Crop.cfg for XeLaTeX"
DESCRIPTION = "The xetexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45845"

RPM_NAME = "texlive-xetexconfig-2023.201.svn45845-52.2.noarch.rpm"
RPM_HASH = "12cfd62729cceddac8fa2c7911d04eaefe6b8a7cd105be8341d2772fe6a44c9fda1ac50ff721525ec88d482c1ce751310bad84cd1d7d688965eda19a334d0be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crop.cfg \
texlive-xetexconfig"

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
