SUMMARY = "A collection of Metafont mode_def's"
DESCRIPTION = "The modes file collects all known Metafont modes for printing \
or display devices, of whatever printing technology. Special \
provision is made for write-white printers, and a 'landscape' \
mode is available, for making suitable fonts for printers with \
pixels whose aspect is non-square. The file also provides \
definitions that make \\specials identifying the mode in \
Metafont's GF output, and put coding information and other \
Xerox-world information in the TFM file."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.2svn61719"

RPM_NAME = "texlive-modes-2023.201.4.2svn61719-54.1.noarch.rpm"
RPM_HASH = "cf809fe4c8120a9410e93a03220da4a5ac5afa6fa1f07e4abbc4b83b3d22114f0c239b080cb2cfb900f0715ab1754ea3156575434921719057e5f072b2131121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modes"

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
