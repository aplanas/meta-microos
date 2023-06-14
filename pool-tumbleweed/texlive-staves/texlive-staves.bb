SUMMARY = "Typeset Icelandic staves and runic letters"
DESCRIPTION = "This package contains all the necessary tools to typeset the \
'magical' Icelandic staves plus the runic letters used in \
Iceland. Included are a font in Adobe Type 1 format and LaTeX \
support."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-staves-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "fae03eb12d77480715f7760bad85f80324177e461e65e0664e6324e5c5b5f270d9db30fda093f09d9641b7906ff95d1709aa3cb52298c80516cc96533130d9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icelandic.map \
tex-icelandic.tfm \
tex-staves.sty \
texlive-staves"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-staves-fonts"

inherit rpm
