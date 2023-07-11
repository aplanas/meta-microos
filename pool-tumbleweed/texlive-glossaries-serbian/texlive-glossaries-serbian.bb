SUMMARY = "Serbian language module for glossaries package"
DESCRIPTION = "Serbian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "03d7e80c272b6a4bd1e8b736e0130166510c6889375ed04f498e79d662b351dd1d108574c0f828597cc57e0ed4d35eff57eaf90d4a61a2de3f01790c52b5646d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-serbian-noenc.ldf \
tex-glossaries-serbian-utf8.ldf \
tex-glossaries-serbian.ldf \
texlive-glossaries-serbian"

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
