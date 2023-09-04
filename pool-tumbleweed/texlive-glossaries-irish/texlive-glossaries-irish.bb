SUMMARY = "Irish language module for glossaries package"
DESCRIPTION = "Irish language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "bf1a7ba9222fb3ed20c56604e3c7b20fb25790990a91291d35c0c29a62b3a9862d271a31080f953bbaace400a2308ada85a13d932fa017db5326bd2639ae0df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-irish-noenc.ldf \
tex-glossaries-irish-utf8.ldf \
tex-glossaries-irish.ldf \
texlive-glossaries-irish"

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
