SUMMARY = "Collection of dvips PostScript headers"
DESCRIPTION = "This is a collection of dvips PostScript header and dvips \
config files. They control certain features of the printer, \
including: A4, A3, usletter, simplex, duplex / long edge, \
duplex / short edge, screen frequencies of images, black/white \
invers, select transparency / paper for tektronix 550/560, \
manual feeder, envelope feeder, and tray 1, 2 and 3, and \
printing a PostScript grid underneath the page material--very \
useful for measuring and eliminating paper feed errors!"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn13293"

RPM_NAME = "texlive-dvipsconfig-2023.209.1.6svn13293-54.2.noarch.rpm"
RPM_HASH = "def87217712aa9da40c227634708b95f5626dabba07e47c6c1123992f760628d7ec1991c979201773e10b909f949693e77a393919b1e3964bc93730d79045bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvipsconfig"

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
