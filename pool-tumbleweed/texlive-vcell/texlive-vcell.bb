SUMMARY = "Vertical alignment of content inside table cells"
DESCRIPTION = "This package offers low-level macros to build rows with \
vertically-aligned cells (top, middle or bottom) and calculate \
the height of a row. These cells can have variable or fixed \
height and can be paragraph-cells or inline-cells. Different \
vertical alignments can be used in the same row."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn59039"

RPM_NAME = "texlive-vcell-2023.201.1.0.2svn59039-53.1.noarch.rpm"
RPM_HASH = "d76a09ae0eec6cfa8e2a457f56b9834d5cd33468efe7056cbb665012718210bc244b9fe83ac810eaf4cab1dee183c1374f7ea444144ec043d5903ed740fbe554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vcell.sty \
texlive-vcell"

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
