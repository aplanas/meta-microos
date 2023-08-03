SUMMARY = "Seminar proceedings"
DESCRIPTION = "The package provides functionality for typesetting seminar \
proceedings based on KOMA-Script's scrreprt class and etoc. It \
offers an alternative to \\chapter that typesets the speaker and \
if necessary the typist of the notes for the talk in question. \
Moreover, the class provides two types of table of contents. A \
global table of contents showing only the talks of the seminar \
and the respective speakers and a local table of contents for \
each talk showing the sections and subsections of the \
respective talk."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn37568"

RPM_NAME = "texlive-semproc-2023.209.0.0.1svn37568-54.1.noarch.rpm"
RPM_HASH = "547d7b323c522eabffcdb5243001868d0128980acd885ed64c8de19c0f84d9b518e66b7a5454f1eebcef02be1c1a4286ad1a8b1cbe9c1919d8813fb117aa158b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semproc.cls \
texlive-semproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-bookmark.sty \
tex-csquotes.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-scrreprt.cls \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
