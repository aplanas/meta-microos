SUMMARY = "Associated counters stepping simultaneously"
DESCRIPTION = "This package provides a way of associating counters to an \
existing driver counter so that incrementing the driver counter \
will increase its associated counters as well. This package can \
be regarded as a supplement to the totcount package by \
Vasileios Koutavas, but it can be used without it, too. \
xassoccnt is a successor and a complete rewrite of the assoccnt \
package by the same author. However, as of 2017-03-05, some \
features of assoccnt are not (yet) contained in xassoccnt so \
that the older package cannot yet be regarded as obsolete."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-2023.209.2.0svn61112-53.1.noarch.rpm"
RPM_HASH = "a3c188508ce791ebaa57a4bac1d2458d9471384fcf5b646e10805c5445419a841db0a03ce7e0fb717b487a331828209f48daaae35d0b2dcc8f359b48f3fabbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xassoccnt.sty \
texlive-xassoccnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-l3keys2e.sty \
tex-letltxmacro.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
