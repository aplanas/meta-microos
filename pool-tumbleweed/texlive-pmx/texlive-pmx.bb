SUMMARY = "Preprocessor for MusiXTeX"
DESCRIPTION = "PMX provides a preprocessor for MusiXTeX. pmxab builds a TeX \
input file based on a .pmx input file in a much simpler \
language, making most of the layout decisions by itself. It has \
most of MusiXTeX's functionality, but it also permits in-line \
TeX to give access to virtually all of MusiXTeX. For \
proof-listening, pmxab will make a MIDI file of your score. \
scor2prt is an auxiliary program that makes parts from a score."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.00svn65926"

RPM_NAME = "texlive-pmx-2023.201.3.00svn65926-52.1.noarch.rpm"
RPM_HASH = "d41fed292daf12f59457620cb6baa56af091798262f88c40ffc7590046a630c8f7877c39506628bbf656cb4b80235ae48abc6ed46f28f63c1e7519e5eadd1ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pmx.tex) \
texlive-pmx"

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
texlive-pmx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
