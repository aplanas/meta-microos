SUMMARY = "A tutorial for XY-pic, in Portuguese"
DESCRIPTION = "The xypic-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-xypic-tut-pt-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "44fc82c911fb753053fef39e7fb8e44b42268cafc65b8a14b302400d29a1d019cfc80ff56c39734672d1a36563789d733d6ededf1456e9c69f7a38f94a2d6fc5"
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
