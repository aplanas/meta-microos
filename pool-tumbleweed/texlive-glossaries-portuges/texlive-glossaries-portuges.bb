SUMMARY = "Portuges language module for glossaries package"
DESCRIPTION = "Portuges language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-2023.201.1.1svn36064-53.2.noarch.rpm"
RPM_HASH = "40c1237c5a937ff52bba2d31d0eda8a626e682ffa60a035eb23b8138b87321e2736f5cb4daf4661be172ecd5f24f914bd6641da5cff703b2dcd2a8e04d5ac8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-portuges-noenc.ldf \
tex-glossaries-portuges-utf8.ldf \
tex-glossaries-portuges.ldf \
tex-glossaries-pt-BR.ldf \
texlive-glossaries-portuges"

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
