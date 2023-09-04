SUMMARY = "Polish language module for glossaries package"
DESCRIPTION = "Polish language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "2a9d126b9bdf077f15e2288155624b7553412fe8f439f3b645bd735f8e3c337ef56efd46220115d9b0ff415dae91704b8b2eaa7b05981c1f50b3687ec4b2722b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-polish-noenc.ldf \
tex-glossaries-polish-utf8.ldf \
tex-glossaries-polish.ldf \
texlive-glossaries-polish"

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
