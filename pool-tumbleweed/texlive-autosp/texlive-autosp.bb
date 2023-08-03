SUMMARY = "A Preprocessor that generates note-spacing commands for MusiXTeX scores"
DESCRIPTION = "This program simplifies the creation of MusiXTeX scores by \
converting (non-standard) commands of the form \\anotes ... \\en \
into one or more conventional note-spacing commands, as \
determined by the note values themselves, with \\sk spacing \
commands inserted as necessary. The coding for an entire \
measure can be entered one part at a time, without concern for \
note-spacing changes within the part or spacing requirements of \
other parts. For example, \\anotes\\qa J\\qa K&\\ca l\\qa m\\ca n\\en \
generates \\Notes\\qa J\\sk\\qa K\\sk&\\ca l\\qa m\\sk\\ca n\\en ."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn58211"

RPM_NAME = "texlive-autosp-2023.209.svn58211-54.1.noarch.rpm"
RPM_HASH = "79d83e307187204e50f1d289e210161109d4cb4908609aac370fbd2919a69db5abb3d25518e50b28117c59aee8e3f7e0a439dd5f3f8c488cac6e4bbe3e2cfaaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-autosp.1 \
man-tex2aspc.1 \
texlive-autosp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-autosp-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
