SUMMARY = "Seven predefined chapter heading styles"
DESCRIPTION = "Each style can be modified using a set of simple commands. \
Optionally one can modify the formatting routines in order to \
create additional chapter headings. This package was previously \
known as FancyChapter."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn20710"

RPM_NAME = "texlive-fncychap-2023.209.1.34svn20710-53.1.noarch.rpm"
RPM_HASH = "4c2f17bc45f6664d5c70f3b6639fcd21259f04c41e583b45b1250bb3474f914ab1236a7f241bdcd4aa71ec817b5e09c6e8b53e96ee94be2504126247f52dacd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fncychap.sty \
texlive-fncychap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
