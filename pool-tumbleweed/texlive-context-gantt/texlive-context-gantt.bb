SUMMARY = "GANTT module for ConTeXt"
DESCRIPTION = "Gantt is a module for drawing Gantt charts via MetaPost or \
PGF/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-gantt-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "0574fb9863a33a211047df102f41cc700327ba28495d4185afd773aff0864fa10fe64277dc04fd4175c766111f6f6cd48c5b026bda55a2ba0073dad6e80e9469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gantt-s-mp.tex \
tex-gantt-s-tikz.tex \
tex-t-gantt.tex \
texlive-context-gantt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-hatching \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
