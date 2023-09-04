SUMMARY = "DVI to Laserjet output"
DESCRIPTION = "A dvi driver for the LaserJet printers, using kpathsea \
recursive file searching. Note: this program will not compile \
simply with the sources in this distribution; it needs a full \
(current) kpathsea distribution environment, such as is \
available from the TeX Live source tree."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-dviljk-2023.209.svn66186-54.2.noarch.rpm"
RPM_HASH = "c0bd50021b361000b241262e46ce40917a4c56f405dadeec99deb4fd1db65f8f24bd57bbe1f7c55c8fa4dbaa0fac808b4afa6129fe79ed82d359cdbe3ac67b56"
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
