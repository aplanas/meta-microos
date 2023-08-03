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

RPM_NAME = "texlive-dvipsconfig-2023.209.1.6svn13293-54.1.noarch.rpm"
RPM_HASH = "7962bc75491ec5ad2ce398cc667bdfe33c457dec7d68f15f63ec301242bc35b09b2447bb57bb0a5194a8c2c3f509fc8cbdfd4fec6eb066a7bb9265aad4892c38"
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
