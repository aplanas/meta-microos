SUMMARY = "Compare two strings"
DESCRIPTION = "The file defines a macro \\compare, which takes two arguments; \
the macro expands to -1, 0, 1, according as the first argument \
is less than, equal to, or greater than the second argument. \
Sorting is alphabetic, using ASCII collating order."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn54265"

RPM_NAME = "texlive-compare-2023.209.svn54265-54.1.noarch.rpm"
RPM_HASH = "e1807ab3e3c13faa7c4d2bf9ff6551e57d800fc789c588ee29854ef9bb7476ee460e61752a8e7990d5fb6fa36179006da894818a51bf0a837729972e722b9045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-compare.tex \
texlive-compare"

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
