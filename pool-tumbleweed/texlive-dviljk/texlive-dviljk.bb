SUMMARY = "DVI to Laserjet output"
DESCRIPTION = "A dvi driver for the LaserJet printers, using kpathsea \
recursive file searching. Note: this program will not compile \
simply with the sources in this distribution; it needs a full \
(current) kpathsea distribution environment, such as is \
available from the TeX Live source tree."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-dviljk-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "5131e7e38d76d16a6566ee4be6de0ff6f7cf3322acb39359bff48d381fe3ea106aff56559ee007c3f7a6a324ca8b3e7a658688368656b5b198f5f579a64f90b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvihp.1 \
man-dvilj.1 \
man-dvilj2p.1 \
man-dvilj4.1 \
man-dvilj4l.1 \
man-dvilj6.1 \
texlive-dviljk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviljk-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
