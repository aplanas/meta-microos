SUMMARY = "A simple geometrical font"
DESCRIPTION = "Tapir is a simple geometrical font mostly created of line and \
circular segments with constant thickness. The font is \
available as Metafont source and in Adobe Type 1 format. The \
character set contains all characters in the range 0-127 (as in \
cmr10), accented characters used in the Czech, Slovak and \
Polish languages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn20484"

RPM_NAME = "texlive-tapir-2023.201.0.0.2svn20484-54.1.noarch.rpm"
RPM_HASH = "0a5156802172d0564756dc2935b1a4c331d001a6f3e4758feb581646ae6e7f14e926264ff1bd58389662b3fb4e50eb12e42bbcb2fdba6cbbc06f3274e620d8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tapir"

RDEPENDS:${PN} += "/bin/sh \
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
