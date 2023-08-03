SUMMARY = "Nynorsk language module for the glossaries package"
DESCRIPTION = "Norwegian Nynorsk language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-2023.209.1.0svn55189-54.1.noarch.rpm"
RPM_HASH = "93548bcbac0369b8970839cc65fe9a586a2452d5d730094dafbb8741d14e6ce75250e94c484ac270696a5c1b60b790492bad75bbc4b25cdc1d3458c8a41f4579"
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
