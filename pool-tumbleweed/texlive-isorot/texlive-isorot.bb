SUMMARY = "Rotation of document elements"
DESCRIPTION = "The package is for rotation of document elements. It is a \
combination of the lscape package and an extension of the \
rotating package. The package is designed for use with the iso \
class but may be used with any normal class."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-isorot-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "b14e4609491eb3a711aca11c663af559d445ef183db518007a94b7c8fdecee7f9853e0d7b0396f3e1e46e13f051986eb87deacf58e50513501a519bdb9ddabf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isorot.sty \
texlive-isorot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-lscape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
