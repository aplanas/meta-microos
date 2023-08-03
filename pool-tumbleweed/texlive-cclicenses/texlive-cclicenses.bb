SUMMARY = "Typeset Creative Commons licence logos"
DESCRIPTION = "The cclicenses package helps users typesetting Creative Commons \
logos in LaTeX. It defines some commands useful to quickly \
write these logos, related to CC licences versions 1.0 and 2.0."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cclicenses-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "610eda878f529007d03154d7ec65679880bd10205f1d4e4abacac1856d7654efe65416d9d14995457c8f4cd6e013e21542cd92069e50a39e925c02c417ac17ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cclicenses.sty \
texlive-cclicenses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
