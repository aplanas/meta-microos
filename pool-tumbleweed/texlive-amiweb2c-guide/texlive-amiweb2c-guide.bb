SUMMARY = "How to install AmiWeb2c"
DESCRIPTION = "This is a guide for the installation of (La)TeX with the Amiga \
port of Web2C named AmiWeb2C in the version 2.1 on an emulated \
Amiga 4000 computer running Workbench 3.1. Furthermore the \
installation of an ARexx server for calling LaTeX from an \
editor is described and some tips for the installation of new \
fonts are given."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56878"

RPM_NAME = "texlive-amiweb2c-guide-2023.209.1.0svn56878-55.1.noarch.rpm"
RPM_HASH = "f495d8a264198bcd9569972115ae56ce503c467c411840ca763283b8d88c60f01545b360ae4303679402a1006d0cf866dd4838aefdd0d1e208f2acfcc0e8df32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amiweb2c-guide"

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
