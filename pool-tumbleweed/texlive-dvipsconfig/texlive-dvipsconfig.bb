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

RPM_NAME = "texlive-dvipsconfig-2023.201.1.6svn13293-53.2.noarch.rpm"
RPM_HASH = "1d3643689671a5eec458ac531db4f5184beff4fb1f53c050d6341e969d6e840467a7bb857e82671f6a18c1c8a855abcd9227be2c8ccda20ad0b1001312e67b8f"
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
