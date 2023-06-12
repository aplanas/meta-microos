SUMMARY = "Underlined running heads"
DESCRIPTION = "Defines two pagestyles that provide underlined page heads in \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-underlin-2023.201.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "9f94b28c00ea73df84ca6f4f665d61ea7b81bb1cb5a6a17cb611f50a27bea447e26c99de793b43014f5b7a97fcf704a7c2638f62e7c556d49cdae654aa2c047c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(underlin.sty) \
texlive-underlin"
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
