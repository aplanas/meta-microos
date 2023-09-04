SUMMARY = "Support for old German fonts"
DESCRIPTION = "A LaTeX interface to the old-german fonts designed by Yannis \
Haralambous: Gothic, Schwabacher, Fraktur and the baroque \
initials."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn50755"

RPM_NAME = "texlive-yfonts-2023.209.1.4svn50755-53.2.noarch.rpm"
RPM_HASH = "e0de149abbd8e8845ce1cc83cec4cc54d76492d0cccdc09dba64e6920c61f646f6ef00d8e0ce26b6e60c3d55514d6b7779cbda63451b5539ee52773d8129f954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yfonts.sty \
texlive-yfonts"

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
