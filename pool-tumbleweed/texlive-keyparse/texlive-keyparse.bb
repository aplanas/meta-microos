SUMMARY = "Key based parser"
DESCRIPTION = "This LaTeX package provides an interface to define and evaluate \
key-based replacement rules. It can be used to parse the \
argument specification of a document command."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn60277"

RPM_NAME = "texlive-keyparse-2023.209.1.1svn60277-56.1.noarch.rpm"
RPM_HASH = "d3f9d9b028a98ba9af94e29cffbba171204e3e62bb268ee8a609eb8896e269277377e15bb74e24be8c8e07e8a3ac81830616431d55061c292676829339c41588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyparse.sty \
texlive-keyparse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
