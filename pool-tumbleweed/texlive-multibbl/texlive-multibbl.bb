SUMMARY = "Multiple bibliographies"
DESCRIPTION = "The package multibbl redefines the standard bibliographic \
commands so that one can generate multiple reference sections. \
Each section has it own auxiliary file (for use with BibTeX) \
and title."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-multibbl-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "d3fc0c206ffd6c81394848d15bb11baae933b5671de3c5924270517f1b6569c234db151fb411f2b39719c3ef8047b3affae27169d57f6bb06145d55a31b9bb8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibbl.sty \
texlive-multibbl"

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
