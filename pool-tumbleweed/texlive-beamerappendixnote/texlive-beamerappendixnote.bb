SUMMARY = "Create notes on appendix frames in beamer"
DESCRIPTION = "This package introduces the \\appxnote command, which puts the \
note's content on a separate beamer frame shown by the command \
\\printappxnotes. It also creates interactive buttons to move \
back and forth between the two frames."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn55732"

RPM_NAME = "texlive-beamerappendixnote-2023.201.1.2.0svn55732-53.1.noarch.rpm"
RPM_HASH = "2af913140eed8096453d863cf19d0e7e1db8a752979cf5f49b4d2c823323354c6120f0b7f61219b19c39df78339a8355e0352a5ef081127b86e750e4500c8a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerappendixnote.sty \
texlive-beamerappendixnote"

RDEPENDS:${PN} += "/bin/sh \
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
