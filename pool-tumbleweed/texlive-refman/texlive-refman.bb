SUMMARY = "Format technical reference manuals"
DESCRIPTION = "Document classes (report- and article-style) for writing \
technical reference manuals. It offers a wide left margin for \
notes to the reader, like some of the manuals distributed by \
Adobe."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0esvn15878"

RPM_NAME = "texlive-refman-2023.201.2.0esvn15878-53.1.noarch.rpm"
RPM_HASH = "f8c835635af121ef7df4093a08363126bd6188467f45efd4f904bb1171b9e139563748adc015761def986516c4b3261da7b86eba6d8836131bf84a3d9c3f102b"
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
