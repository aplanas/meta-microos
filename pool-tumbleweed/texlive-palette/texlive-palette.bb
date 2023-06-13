SUMMARY = "Create palettes for colors and symbols that can be swapped in"
DESCRIPTION = "The package `palette` contains two files: `colorpalette.sty` \
and `symbolpalette`. One deals with colors and the other deals \
with symbols; the implementation is quite similar. With this \
package you can create themes. Each of these themes have a set \
of colors, and you can create palettes based on this theme with \
specific color values for each of the theme's color slots. The \
active palette for each theme can be swapped in to make \
experimenting with colors easier or give users choices as to \
which theme they pick."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn60119"

RPM_NAME = "texlive-palette-2023.201.1.1.0svn60119-51.1.noarch.rpm"
RPM_HASH = "339d17c12b8f0a12476cb3ec3651c885df7ee1b58903d57d7aba345ffcf5c748e22f9aa15bea5ad95e207c8c6e4af0e5932cfa275503c03e0bcf7b982d2f6979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colorpalette.sty) \
tex(symbolpalette.sty) \
texlive-palette"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(macrolist.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
