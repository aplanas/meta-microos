SUMMARY = "BibLaTeX implementation of the Science bibliography style"
DESCRIPTION = "The bundle offers styles that allow authors to use BibLaTeX \
when preparing papers for submission to the journal Science."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn48945"

RPM_NAME = "texlive-biblatex-science-2023.209.1.2svn48945-54.1.noarch.rpm"
RPM_HASH = "cf70d3e80d1816d8d975ef4e8ba80df4dcce3a11d137a9644f28d8f1b7a34755b5e143504ef4803970fe9bca59c8020dbb507058976ec5a4b4ebe08266764bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-science.bbx \
tex-science.cbx \
texlive-biblatex-science"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
