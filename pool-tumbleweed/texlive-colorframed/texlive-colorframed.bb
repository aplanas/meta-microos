SUMMARY = "Fix color problems with the package 'framed'"
DESCRIPTION = "This package fixes problems with colour loss that occurres in \
the environments of the framed package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9bsvn64551"

RPM_NAME = "texlive-colorframed-2023.209.0.0.9bsvn64551-54.1.noarch.rpm"
RPM_HASH = "c532ec0cbf7f505518b39b4422e33a7d6708fc149c39bdf344d270c4e0e147ad768d9adf3c56b4fe9fd975471453f656ab62ab847072edb5c78281d0f176af19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorframed.sty \
texlive-colorframed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-framed.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
