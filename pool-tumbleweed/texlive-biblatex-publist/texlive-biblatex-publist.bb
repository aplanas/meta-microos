SUMMARY = "BibLaTeX bibliography support for publication lists"
DESCRIPTION = "The package provides a BibLaTeX bibliography style file (*.bbx) \
for publication lists. The style file draws on BibLaTeX's \
authoryear style, but provides some extra features often \
desired for publication lists, such as the omission of the \
author's own name from author or editor data. At least version \
3.4 of biblatex is required."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn66273"

RPM_NAME = "texlive-biblatex-publist-2023.201.2.2svn66273-53.1.noarch.rpm"
RPM_HASH = "9d6c336c03c77c2d99af89bcc4a76996b030816e53f82ae70de92ad63b80eafb6eb1bc993a078720ef6d955fead853f8ee1147d5e8e09a9ff06cd20cd54f20a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-publist.bbx \
tex-publist.cbx \
texlive-biblatex-publist"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
