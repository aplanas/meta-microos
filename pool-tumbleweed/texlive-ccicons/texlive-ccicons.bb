SUMMARY = "LaTeX support for Creative Commons icons"
DESCRIPTION = "The package provides the means to typeset Creative Commons \
icons, in documents licensed under CC licences. A font (in \
Adobe Type 1 format) and LaTeX support macros are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54512"

RPM_NAME = "texlive-ccicons-2023.209.1.6svn54512-53.1.noarch.rpm"
RPM_HASH = "fed9b1faff533021a9ad79716dfb918e2e7e49e02f8c458552444fc938528b184055e6114a5cb04a7acc2ad3b8c2f7d97d568aaa56f15a10e6b27a7985ea203c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccicons-u.enc \
tex-ccicons.map \
tex-ccicons.sty \
tex-ccicons.tfm \
texlive-ccicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-ccicons-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
