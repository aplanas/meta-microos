SUMMARY = "DVI to Laserjet output"
DESCRIPTION = "A dvi driver for the LaserJet printers, using kpathsea \
recursive file searching. Note: this program will not compile \
simply with the sources in this distribution; it needs a full \
(current) kpathsea distribution environment, such as is \
available from the TeX Live source tree."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-dviljk-2023.201.svn66186-53.2.noarch.rpm"
RPM_HASH = "9e673b2721cf7012c97fbea4d668b676bd2576504bb3ca4a9f858e372cc71a4cffd62b367a76b37cbc53cc0fcb882164644f6bb791e51a6a3221ba1f7902b074"
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
