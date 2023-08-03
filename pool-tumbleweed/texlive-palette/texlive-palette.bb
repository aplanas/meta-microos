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

PV = "2023.209.1.1.0svn60119"

RPM_NAME = "texlive-palette-2023.209.1.1.0svn60119-52.1.noarch.rpm"
RPM_HASH = "959a1b3052fde53ef73f7d6d4f86458c22e55778bdc8ea27492a91ba6395595be59ff298d2212a6bd5f0f420fd74f33768911021cceab2a6c38e5d784786a8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorpalette.sty \
tex-symbolpalette.sty \
texlive-palette"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-macrolist.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
