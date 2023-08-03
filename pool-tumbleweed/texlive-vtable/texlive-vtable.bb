SUMMARY = "Vertical alignement of table cells"
DESCRIPTION = "The package allows vertical alignement of table cell by \
providing: Z, L, C, R, J and I column types \\nextRow and \\lb \
commands \\setMultiColRow, \\setMultiColumn, \\setMultiRow and \
\\tableFormatedCell commands for tabular and similar \
environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51126"

RPM_NAME = "texlive-vtable-2023.209.1.0svn51126-54.1.noarch.rpm"
RPM_HASH = "f5da59531482dbecfbaee137ef0faeef4a588dd95f187350ae9848a66625d026031bbc2346dbe414f7ef5c91197cfac9c664ae3cf36739686c4fe4b91e0407a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vtable.sty \
texlive-vtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-array.sty \
tex-calc.sty \
tex-dashrule.sty \
tex-etoolbox.sty \
tex-forloop.sty \
tex-graphicx.sty \
tex-varwidth.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
