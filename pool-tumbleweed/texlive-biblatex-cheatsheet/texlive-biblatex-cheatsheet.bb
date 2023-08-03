SUMMARY = "BibLaTeX/Biber 'cheat sheet'"
DESCRIPTION = "A BibLaTeX/Biber 'cheat sheet' which I wrote because I wanted \
one to distribute to students, but couldn't find an existing \
one."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44685"

RPM_NAME = "texlive-biblatex-cheatsheet-2023.209.svn44685-54.1.noarch.rpm"
RPM_HASH = "4d0dd0179c163e630ab9e881ed31d3bcb74fc32b85b1bb8edbd4dd89d4eb52f45cbc94cd8171c7a4f1d7c100a466fae3c52a5d387b4b25ec01a37670256e4f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cheatsheet"

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
