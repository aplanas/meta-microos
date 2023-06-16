SUMMARY = "Obsolete packages and commands"
DESCRIPTION = "The 'sins' of LaTeX users, and how to correct them. The \
document provides a list of obsolete packages and commands. \
This original is in German; it has been translated into \
English, French, Italian, and Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn63708"

RPM_NAME = "texlive-l2tabu-2023.201.2.4svn63708-55.1.noarch.rpm"
RPM_HASH = "1178c16472b1c5bd8a0e5f958f833d7bcecc5eceb332ea17d8e5cd4d4431603e39ed65f4103b6b75b0cd8ad0a626e00e6a055d815d0622888de646f69ba942da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu"

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
