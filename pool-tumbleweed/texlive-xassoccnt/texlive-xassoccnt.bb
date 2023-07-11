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

PV = "2023.201.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-2023.201.2.0svn61112-52.2.noarch.rpm"
RPM_HASH = "5e8c6bfcb87e52addd5ad1993684f6a6f71d170f070166e2907e14c6e57bb4669c3bc745d8f1008628a03dd7bee36957212cc3f8260229e10d075fcb53c8963c"
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
