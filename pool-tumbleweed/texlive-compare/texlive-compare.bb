SUMMARY = "Compare two strings"
DESCRIPTION = "The file defines a macro \\compare, which takes two arguments; \
the macro expands to -1, 0, 1, according as the first argument \
is less than, equal to, or greater than the second argument. \
Sorting is alphabetic, using ASCII collating order."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn54265"

RPM_NAME = "texlive-compare-2023.201.svn54265-53.1.noarch.rpm"
RPM_HASH = "392f45f930b2718dd245869c3c4f31a185ead5a06754654ea6e85cf6fd40ca5b48858ef5318d169d442050fb628715064083b9ba88c7e81a049dd8a6fb15d934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(compare.tex) \
texlive-compare"

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
