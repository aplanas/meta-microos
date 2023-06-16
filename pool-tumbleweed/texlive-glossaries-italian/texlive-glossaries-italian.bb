SUMMARY = "Italian language module for glossaries package"
DESCRIPTION = "Italian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "a03a6e589755506cc6b7a3ba2ccbd3aa088b5eaf030cc10070ff35ba38df1723637ff4801ed357766c691ebf678198a47621acce4d59720312952a8d8d9ae14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-italian.ldf \
texlive-glossaries-italian"

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
