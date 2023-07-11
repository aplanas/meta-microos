SUMMARY = "Graphics and text watermarks on selected pages"
DESCRIPTION = "The package extends the author's draftmark and the watermark \
packages. It is currently unmaintained and does not work with \
modern LaTeX releases."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-2023.201.1.5.2dsvn61719-52.2.noarch.rpm"
RPM_HASH = "c8024dcabd005060b2ae8211a759dad8bd2872b1f7dc2b11009c8fa465d7d898f0440ab6c4ec7eebee771d584b0cdea986d84002da2fbdfa92b2b9586f7808c3"
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
