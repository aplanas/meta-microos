SUMMARY = "Add bibliography/index/contents to Table of Contents"
DESCRIPTION = "Automatically adds the bibliography and/or the index and/or the \
contents, etc., to the Table of Contents listing."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5ksvn20085"

RPM_NAME = "texlive-tocbibind-2023.201.1.5ksvn20085-52.1.noarch.rpm"
RPM_HASH = "365c57da3cb3e28e19496cddf8099ac96caa23144d16d14cac4c2d26a7e4d21e23405e1b7b40440a5fdf67b007c257996179662889704683177bc70023ebc2c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocbibind.sty \
texlive-tocbibind"

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
