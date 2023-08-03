SUMMARY = "Print the tags of bibliography entries"
DESCRIPTION = "Prints the tag right-aligned on each line of the bibliography."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.05svn20336"

RPM_NAME = "texlive-showtags-2023.209.1.05svn20336-54.1.noarch.rpm"
RPM_HASH = "016aca127fc71c45758f3dc5643bde6e3b8bdc6a54fb926f577320d7430430c5892b6800fe780a2a8562510a56007b3e7f134ea3b552f0afd68c28ac8916769c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showtags.sty \
texlive-showtags"

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
