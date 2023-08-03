SUMMARY = "Portuges language module for glossaries package"
DESCRIPTION = "Portuges language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-2023.209.1.1svn36064-54.1.noarch.rpm"
RPM_HASH = "7113d255d59f3f33a0577d60d45a3809d4eabb5eb0542778454f491ad43f61f217f6ecfffb785fbc6037fc1ae27d6b8d445e13090c54130c7b958c1bf4496c44"
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
