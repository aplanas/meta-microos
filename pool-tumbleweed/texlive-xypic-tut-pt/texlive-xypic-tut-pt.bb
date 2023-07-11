SUMMARY = "A tutorial for XY-pic, in Portuguese"
DESCRIPTION = "The xypic-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-xypic-tut-pt-2023.201.svn15878-52.2.noarch.rpm"
RPM_HASH = "bd8d716d9308f00203a11fd3870e883841139338dfd86f953f50666769cc9c8d022c4c172cc8ba7c77c7d574e20d30b03167cbcf9def2ee635713b59c21562c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xypic-tut-pt"

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
