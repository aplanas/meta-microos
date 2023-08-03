SUMMARY = "Graphics and text watermarks on selected pages"
DESCRIPTION = "The package extends the author's draftmark and the watermark \
packages. It is currently unmaintained and does not work with \
modern LaTeX releases."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-2023.209.1.5.2dsvn61719-53.1.noarch.rpm"
RPM_HASH = "efba8fc92007e254aef547908fd4463ef94dba66eb3ad662d3ed0b604a7fe7fdf581311098e637d7a829c89c391e6899e6b1025c81c8daf744139d8f849a78c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xwatermark.sty \
texlive-xwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
