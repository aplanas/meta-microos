SUMMARY = "A font for die faces"
DESCRIPTION = "A Metafont font that can produce die faces in 2D or with \
various 3D effects."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28501"

RPM_NAME = "texlive-dice-2023.201.svn28501-52.1.noarch.rpm"
RPM_HASH = "a54d666284364339d99eae4db880c604b860283f077658d5cb6e7de0333dc48cad9bf4e655bd780028680c2e58e09acd2a1912d8c1c4c816bf3fee3a1541d252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dice3d.tfm) \
texlive-dice"

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
