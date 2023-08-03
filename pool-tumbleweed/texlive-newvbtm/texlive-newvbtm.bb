SUMMARY = "Define your own verbatim-like environment"
DESCRIPTION = "Defines general purpose macro named \\newverbatim to define your \
own verbatim-like environment. It also has a supplementary \
style file varvbtm.sty to provide set of macros for variants of \
verbatim, such as tab emulation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn23996"

RPM_NAME = "texlive-newvbtm-2023.209.1.1svn23996-55.1.noarch.rpm"
RPM_HASH = "a55a0535528ec79ace2eaa04775a29408799f93fe6e163bc5a39360385b1edcb1e970b25f54a19c52adb0594d6aff7bd60213f6037446294910a0585b5f7fa96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newvbtm.sty \
tex-varvbtm.sty \
texlive-newvbtm"

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
