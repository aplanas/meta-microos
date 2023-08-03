SUMMARY = "Tidy \\listfiles with long file names"
DESCRIPTION = "The package equips LaTeX's \\listfiles command with an optional \
argument for the number of characters in the longest base \
filename. This way you get a neatly aligned file list even when \
it contains files whose base names have more than 8 characters. \
The package can be combined with the myfilist package as \
explained in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn27889"

RPM_NAME = "texlive-longnamefilelist-2023.209.0.0.2svn27889-55.1.noarch.rpm"
RPM_HASH = "ebdf7477379fb25c223b100464b045dfef358f67c8a72e9e5983ab98012a7b25ad351f57629dcefd5efe3aeadb930e4e499cc48192e85a787d8307b584894bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longnamefilelist.sty \
texlive-longnamefilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-myfilist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
