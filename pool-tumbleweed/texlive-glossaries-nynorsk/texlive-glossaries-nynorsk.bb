SUMMARY = "Nynorsk language module for the glossaries package"
DESCRIPTION = "Norwegian Nynorsk language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-2023.201.1.0svn55189-53.2.noarch.rpm"
RPM_HASH = "7a654b9bba5530640beb0dfc4e67a988b935d870f6d574a7110668ad771902a0971caa17ece94ae7d66bc686503eec1f41ca3810e84c92a0318f2ae850f82399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-nynorsk.ldf \
texlive-glossaries-nynorsk"

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
