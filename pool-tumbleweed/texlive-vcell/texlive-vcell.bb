SUMMARY = "Vertical alignment of content inside table cells"
DESCRIPTION = "This package offers low-level macros to build rows with \
vertically-aligned cells (top, middle or bottom) and calculate \
the height of a row. These cells can have variable or fixed \
height and can be paragraph-cells or inline-cells. Different \
vertical alignments can be used in the same row."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn59039"

RPM_NAME = "texlive-vcell-2023.209.1.0.2svn59039-54.1.noarch.rpm"
RPM_HASH = "0b100abf8e7aae60f8d06066204777efbfbe8747dc24d37e4f84bc76a06fe5f4d9b2c4b4dc89719bc1a52c19d7fcc9d28382f045da84a676ea6e64fa56439a16"
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
