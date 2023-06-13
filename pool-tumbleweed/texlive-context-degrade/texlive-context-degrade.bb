SUMMARY = "Degrading JPEG images in ConTeXt"
DESCRIPTION = "The context-degrade package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-degrade-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "360e3be8a96c6c6035a9940f48eaf69ee95f7bb728e2595ae67d9e85cb408f37a8531489f8a0e73828a55a11edc9638114cc25dd0d90fa19e907a2b9a3d2fced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-degrade.tex) \
texlive-context-degrade"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
