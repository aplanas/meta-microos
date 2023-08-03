SUMMARY = "Numbering text"
DESCRIPTION = "The package offers facilities for adding a columns of numbering \
to the general text so that the text can be properly \
referenced. The vertical ruler can be scaled and moved freely. \
The package may be used either with LaTeX or with plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn21598"

RPM_NAME = "texlive-vruler-2023.209.2.3svn21598-54.1.noarch.rpm"
RPM_HASH = "5f32f96791487805c6dfc00aea119f316092b86daf398463399cff9975957f7d7b93013e80a6dcbeb61af6ac54aa96cd6a163fef794b43f0c26d640d5de3508e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vruler.sty \
texlive-vruler"

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
