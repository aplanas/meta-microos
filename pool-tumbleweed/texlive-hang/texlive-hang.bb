SUMMARY = "Environments for hanging paragraphs and list items"
DESCRIPTION = "This package provides environments for hanging paragraphs and \
list items. In addition, it defines environments for labeled \
paragraphs and list items."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn43280"

RPM_NAME = "texlive-hang-2023.201.2.1svn43280-53.2.noarch.rpm"
RPM_HASH = "81cba8b3e7d204bb94d6241332d87d97a149a6aa04c2c0b5c7471a8337b089bfe7744ca965943970082966e3e381033f35f2c5196fe562eeda5c66281bcfc0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hang.sty \
texlive-hang"

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
