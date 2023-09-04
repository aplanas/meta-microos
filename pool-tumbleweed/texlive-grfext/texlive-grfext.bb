SUMMARY = "Manipulate the graphics package's list of extensions"
DESCRIPTION = "This package provides macros for adding to, and reordering the \
list of graphics file extensions recognised by package \
graphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53024"

RPM_NAME = "texlive-grfext-2023.209.1.3svn53024-54.2.noarch.rpm"
RPM_HASH = "8f263af808d557f3cd074650918993762a91ba0681f92f2380cb341e1018e85f05a3d2113e7e659658f3e8cd131afc3b680c7a92348446cdd5ed2d029dcb6e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfext.sty \
texlive-grfext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-kvdefinekeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
