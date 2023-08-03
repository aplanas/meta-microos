SUMMARY = "Basque language module for the datetime2 package"
DESCRIPTION = "This module provides the 'basque' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn47064"

RPM_NAME = "texlive-datetime2-basque-2023.209.1.2asvn47064-53.1.noarch.rpm"
RPM_HASH = "5d6b68ad75a4d0a56acf966408497f929fcb6d61bf8b9f334cc236394334c9a92b3619ba8467f4c18354986cdd9c21f545217b047f94689b77858ebc743f3dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-basque.ldf \
texlive-datetime2-basque"

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
