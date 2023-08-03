SUMMARY = "Obsolete packages and commands"
DESCRIPTION = "The 'sins' of LaTeX users, and how to correct them. The \
document provides a list of obsolete packages and commands. \
This original is in German; it has been translated into \
English, French, Italian, and Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn63708"

RPM_NAME = "texlive-l2tabu-2023.209.2.4svn63708-56.1.noarch.rpm"
RPM_HASH = "ab902839134160a6eedc868129dff3215472b7dfa0d86de6ae74623a67b56b50362043a6932dc668c9f7bcb6536314613fd74167595c4da129c5b001ca3f8746"
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
