SUMMARY = "Create notes on appendix frames in beamer"
DESCRIPTION = "This package introduces the \\appxnote command, which puts the \
note's content on a separate beamer frame shown by the command \
\\printappxnotes. It also creates interactive buttons to move \
back and forth between the two frames."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn55732"

RPM_NAME = "texlive-beamerappendixnote-2023.209.1.2.0svn55732-54.1.noarch.rpm"
RPM_HASH = "b7566d7a384059e0c1be4e647c8f08631f34c983cea95b17c917ee3f7a6e9c8b4a77bfe03c69cf3f5f6f915463ae06153c148885443251250b915b2aa67f71eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerappendixnote.sty \
texlive-beamerappendixnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
