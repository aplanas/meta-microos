SUMMARY = "Configuration files for xmltex and pdfxmltex"
DESCRIPTION = "The xmltexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45845"

RPM_NAME = "texlive-xmltexconfig-2023.209.svn45845-53.2.noarch.rpm"
RPM_HASH = "1c685daa4170cadb0f4327b3ee864851ea2edfccc13e4773a6ffaa97cebca3d56019a46c9d65c4305d79f51686bdd97aa63089357cf18c9a64d720b1cba392da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltexconfig"

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
