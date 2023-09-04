SUMMARY = "Facilities for setting interlinear glossed text"
DESCRIPTION = "The package provides extensible macros for setting interlinear \
glossed text -- useful, for instance, for typing linguistics \
papers. The operative word here is 'extensible': few features \
are built in, but some flexible and powerful facilities are \
included for adding your own."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-2023.209.0.0.1svn29103-54.2.noarch.rpm"
RPM_HASH = "20ca599f35372400d5d88677c6b07fa01f3440e0c16d3c4df7845bc7dc6911d82244b2fac26a1082813d81006383dd8a23cb2fb2154a09e65ff80c598bccaadf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvgloss.sty \
texlive-dvgloss"

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
