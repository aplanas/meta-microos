SUMMARY = "Graphics and text watermarks on selected pages"
DESCRIPTION = "The package extends the author's draftmark and the watermark \
packages. It is currently unmaintained and does not work with \
modern LaTeX releases."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-2023.201.1.5.2dsvn61719-52.1.noarch.rpm"
RPM_HASH = "eb2e101408a99ab011b838e0fc324d9f0f11655771403bb0c8db8d8771dc121e0a2aa58e2676837531e7b02d4a32149175789825cf40ad3917c7a9eabb732f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xwatermark.sty \
texlive-xwatermark"

RDEPENDS:${PN} += "/bin/sh \
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
