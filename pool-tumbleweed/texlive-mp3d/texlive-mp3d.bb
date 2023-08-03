SUMMARY = "3D animations"
DESCRIPTION = "Create animations of 3-dimensional objects (such as polyhedra) \
in MetaPost."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn29349"

RPM_NAME = "texlive-mp3d-2023.209.1.34svn29349-55.1.noarch.rpm"
RPM_HASH = "00e56e11c34f230898fda924a572fcad5bf4642f16aa7af093c4a41f8e3a0459b84e1dd3d66b676066393af5f70e24b47d6be5942cee24580e21c58d58e05035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mp3d"

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
