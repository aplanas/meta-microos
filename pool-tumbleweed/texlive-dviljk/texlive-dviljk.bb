SUMMARY = "DVI to Laserjet output"
DESCRIPTION = "A dvi driver for the LaserJet printers, using kpathsea \
recursive file searching. Note: this program will not compile \
simply with the sources in this distribution; it needs a full \
(current) kpathsea distribution environment, such as is \
available from the TeX Live source tree."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-dviljk-2023.201.svn66186-53.1.noarch.rpm"
RPM_HASH = "316624dd4e99dc432b12bfd5139dbcf0dcc14b51edbb7ded90d347cef0dd52e5445a70646a151dca0f3e9ac59ff74d4dd47e39ec90336bf44d1ef8867c97aa1d"
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
