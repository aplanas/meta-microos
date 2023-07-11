SUMMARY = "Enhanced multiple citations"
DESCRIPTION = "The mciteplus LaTeX package is an enhanced reimplementation of \
Thorsten Ohl's mcite package which provides support for the \
grouping of multiple citations together as is often done in \
physics journals. An extensive set of features provide for \
other applications such as reference sublisting."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn31648"

RPM_NAME = "texlive-mciteplus-2023.208.1.2svn31648-53.1.noarch.rpm"
RPM_HASH = "522ce572a916457a2b638a4935f56efea4c1eaed484c5719c88073cffc5a3369c3945c1583a47af765f6c34cafcfea3d580951e8d6963c8c21d807d6604ec788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mciteplus.sty \
texlive-mciteplus"

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
