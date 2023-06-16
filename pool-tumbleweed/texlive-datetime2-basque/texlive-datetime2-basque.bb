SUMMARY = "Basque language module for the datetime2 package"
DESCRIPTION = "This module provides the 'basque' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn47064"

RPM_NAME = "texlive-datetime2-basque-2023.201.1.2asvn47064-52.1.noarch.rpm"
RPM_HASH = "1dd3631fa5972f4b2502b3f99454577ab4beb05e7995cd6eb46071cb3e8bc9a1440307f9933b6e99550e04b2b834c797b207baa3710bafde2aa4e107fefacd50"
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
