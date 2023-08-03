SUMMARY = "Spanish language module for glossaries package"
DESCRIPTION = "Spanish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "0d537630cd8a285d9aa985c01f158c6e2baedf5d4c5eb389b59b90e7ff2661df4fa258806b314e0b39893f31f0463f5474d0e03b7be6317dd3e84474176efe6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-spanish-noenc.ldf \
tex-glossaries-spanish-utf8.ldf \
tex-glossaries-spanish.ldf \
texlive-glossaries-spanish"

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
