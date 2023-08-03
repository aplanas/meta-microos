SUMMARY = "A small package to set arbitrary sizes for the main font of the document"
DESCRIPTION = "The package allows you to set arbitrary sizes for the main font \
of the document, through the fontsize=<size> option."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.5svn60161"

RPM_NAME = "texlive-fontsize-2023.209.0.0.8.5svn60161-53.1.noarch.rpm"
RPM_HASH = "dc21c965d7603e00547a3c21afe6a32853b60bcae46a771b80ec99594f28f6a99c1249c915decec6a2710e112dfb6c2fb141450cc30d90b87695f5ede62c6bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontsize.sty \
texlive-fontsize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xfp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
