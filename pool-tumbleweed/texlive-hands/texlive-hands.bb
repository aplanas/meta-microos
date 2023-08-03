SUMMARY = "Pointing hand font"
DESCRIPTION = "Provides right- and left-pointing hands in both black-on-white \
and white-on-black realisation. The font is distributed as \
Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn13293"

RPM_NAME = "texlive-hands-2023.209.svn13293-54.1.noarch.rpm"
RPM_HASH = "3eef007aa2aed7c4508f1e362fc6ecea7568650ebb6414895b2b0e8e15d66f3bdebdd4318362bb0cc5a0d4f0799b2a365c02c67f88da4ed64fc750404f5dd79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hands.tfm \
texlive-hands"

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
