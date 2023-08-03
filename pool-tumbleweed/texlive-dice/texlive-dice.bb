SUMMARY = "A font for die faces"
DESCRIPTION = "A Metafont font that can produce die faces in 2D or with \
various 3D effects."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28501"

RPM_NAME = "texlive-dice-2023.209.svn28501-53.1.noarch.rpm"
RPM_HASH = "a06e512cdd2d36da38fa1e9d094845379916ae57d6e2959cacf48b71cc258df67dacbb95763c37d7c0bc581a46203de093195f7b378391215d0bbd0aa27883c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dice3d.tfm \
texlive-dice"

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
