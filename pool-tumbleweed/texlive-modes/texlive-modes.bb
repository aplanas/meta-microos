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

PV = "2023.209.4.2svn61719"

RPM_NAME = "texlive-modes-2023.209.4.2svn61719-55.1.noarch.rpm"
RPM_HASH = "e40ba4e56cf14020cb79d68e2e3932f8fecaab85dc9d24ea6162c92ba58be5fdac524a86ae97b90f1c28fe9645776e786b2a0ea100f8740cf7b8c4670bac355e"
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
