SUMMARY = "Preprocessor for MusiXTeX"
DESCRIPTION = "PMX provides a preprocessor for MusiXTeX. pmxab builds a TeX \
input file based on a .pmx input file in a much simpler \
language, making most of the layout decisions by itself. It has \
most of MusiXTeX's functionality, but it also permits in-line \
TeX to give access to virtually all of MusiXTeX. For \
proof-listening, pmxab will make a MIDI file of your score. \
scor2prt is an auxiliary program that makes parts from a score."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.00svn65926"

RPM_NAME = "texlive-pmx-2023.209.3.00svn65926-53.1.noarch.rpm"
RPM_HASH = "cf0d080626568ec9f02165719ed6675c6ca82866e57333715b8592d7f6f9623c63552677f4b97974d618542fc3d59e0d8a0785d432c3cfe1edd478e49e268b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmx.tex \
texlive-pmx"

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
texlive-pmx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
