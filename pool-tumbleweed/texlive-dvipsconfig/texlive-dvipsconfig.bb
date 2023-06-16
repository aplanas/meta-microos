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

PV = "2023.201.1.6svn13293"

RPM_NAME = "texlive-dvipsconfig-2023.201.1.6svn13293-53.1.noarch.rpm"
RPM_HASH = "1b2d3012d7c6fd21a0347a799d5b7d337e9cfd779f6b089dde4b6a8ddc0ae72e8fdb48dbc7c7d31fb7f39ab46bcf886dfb017c531e25960f379494f37e6df1e7"
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
