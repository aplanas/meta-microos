SUMMARY = "Portuges language module for glossaries package"
DESCRIPTION = "Portuges language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-2023.201.1.1svn36064-53.1.noarch.rpm"
RPM_HASH = "765e8800e2d70dea68011f935b58eaf7f366be87539fc08174c32a0a823a3afbb745d54fdda1028dd49cb090924aedbea7afc3eb7f85192a95f81a76ce69badd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-portuges-noenc.ldf) \
tex(glossaries-portuges-utf8.ldf) \
tex(glossaries-portuges.ldf) \
tex(glossaries-pt-BR.ldf) \
texlive-glossaries-portuges"

RDEPENDS:${PN} += "/bin/sh \
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
