SUMMARY = "A class file for typesetting homework and lab assignments"
DESCRIPTION = "A class file for typesetting homework and lab assignments."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20431"

RPM_NAME = "texlive-assignment-2023.209.svn20431-54.1.noarch.rpm"
RPM_HASH = "305e03e6fce13f9e39e91c81514f0518be6f7c12e3585f8837e42ff07b21acfaf12d49e9b189fb7c19023e0d15505d0d884674e83052c61972297bba7b9cfd64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assignment.cls \
texlive-assignment"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
