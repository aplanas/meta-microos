SUMMARY = "A simple geometrical font"
DESCRIPTION = "Tapir is a simple geometrical font mostly created of line and \
circular segments with constant thickness. The font is \
available as Metafont source and in Adobe Type 1 format. The \
character set contains all characters in the range 0-127 (as in \
cmr10), accented characters used in the Czech, Slovak and \
Polish languages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn20484"

RPM_NAME = "texlive-tapir-2023.209.0.0.2svn20484-55.1.noarch.rpm"
RPM_HASH = "b09e95bdde29493e0e9b0009fabe5e58a3392e31a974e72e0ecf7a249e63a1f3b75add670f2bb8e67327090fc83d04a0ef5ee48a0dccc70aa63c7f9d9692c094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tapir"

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
texlive-scripts-bin \
texlive-tapir-fonts"

inherit rpm
