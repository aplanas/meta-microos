SUMMARY = "Magyar language module for glossaries package"
DESCRIPTION = "Magyar language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "74ce8cd8c5baa2da73aace07c5f97eeeb9f690eae732d87dfe54013aff740035e4c6f7f62d1a9940b89e0b40d9e5461cb97f5883c4c24c283f79f74a55f1948e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-magyar-noenc.ldf \
tex-glossaries-magyar-utf8.ldf \
tex-glossaries-magyar.ldf \
texlive-glossaries-magyar"

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
