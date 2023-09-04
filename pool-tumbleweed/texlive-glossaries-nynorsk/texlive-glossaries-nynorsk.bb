SUMMARY = "Nynorsk language module for the glossaries package"
DESCRIPTION = "Norwegian Nynorsk language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-2023.209.1.0svn55189-54.2.noarch.rpm"
RPM_HASH = "a0ed61245592fbb0cd869653f26a961643a1252c7ca5d2f1da524124120cf0cd3dd2025ef85a5d9ab3996a4a7a8835ca00242032588c4a1394ea770c782c402b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-nynorsk.ldf \
texlive-glossaries-nynorsk"

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
