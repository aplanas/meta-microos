SUMMARY = "Format technical reference manuals"
DESCRIPTION = "Document classes (report- and article-style) for writing \
technical reference manuals. It offers a wide left margin for \
notes to the reader, like some of the manuals distributed by \
Adobe."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0esvn15878"

RPM_NAME = "texlive-refman-2023.201.2.0esvn15878-53.2.noarch.rpm"
RPM_HASH = "0725924c519bddde098756a68bbc1630bc1232ac70286cc1469be6ee51cac0b07cc495282cc9d6bddf9888bdda8f293d0c61c5a9071e9ae1ad3875908bb7046e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagepc.sty \
tex-refart.cls \
tex-refrep.cls \
texlive-refman"

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
