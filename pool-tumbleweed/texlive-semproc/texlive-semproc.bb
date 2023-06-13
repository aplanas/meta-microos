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

PV = "2023.201.0.0.1svn37568"

RPM_NAME = "texlive-semproc-2023.201.0.0.1svn37568-53.1.noarch.rpm"
RPM_HASH = "4d96eb4027b44dd24a9d14173712415501d7820de1d58857abcb6f429cc32a9b4d1f1ac61c7a3b233c943d10b277846f25c3ff90ef29cd7f51f0e9ac8f1bac73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(semproc.cls) \
texlive-semproc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(biblatex.sty) \
tex(bookmark.sty) \
tex(csquotes.sty) \
tex(etoc.sty) \
tex(etoolbox.sty) \
tex(scrreprt.cls) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
