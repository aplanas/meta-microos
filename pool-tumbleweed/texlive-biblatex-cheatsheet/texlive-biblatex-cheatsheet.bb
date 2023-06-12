SUMMARY = "BibLaTeX/Biber 'cheat sheet'"
DESCRIPTION = "A BibLaTeX/Biber 'cheat sheet' which I wrote because I wanted \
one to distribute to students, but couldn't find an existing \
one."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44685"

RPM_NAME = "texlive-biblatex-cheatsheet-2023.201.svn44685-53.1.noarch.rpm"
RPM_HASH = "2555be27dbf6e52d3d56386dbf62d92b264aede915db8c533e02048cffa3d5d557844812b446b038a40fa32285664ba0ccd96c991e6307ed8961ccddf02f01be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cheatsheet"
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
texlive-scripts-bin"

inherit rpm
