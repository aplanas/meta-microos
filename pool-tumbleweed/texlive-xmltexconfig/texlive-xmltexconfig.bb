SUMMARY = "Configuration files for xmltex and pdfxmltex"
DESCRIPTION = "The xmltexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45845"

RPM_NAME = "texlive-xmltexconfig-2023.209.svn45845-53.1.noarch.rpm"
RPM_HASH = "10a114bd67b2734cac8c9c22844dcc3727110dc16386f6dda599773016c9f629d33ecbc92fd63997026a9996a3e11163724c0e9208cd2522f689fda7a0db7241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltexconfig"

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
