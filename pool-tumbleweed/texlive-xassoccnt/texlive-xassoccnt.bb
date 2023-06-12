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

RPM_NAME = "texlive-xassoccnt-2023.201.2.0svn61112-52.1.noarch.rpm"
RPM_HASH = "96aa4f486719936770135eabf7d45db530d1fb105f01174ff6d415befd2f95cfc5a1794383d80c5fe3fa4056c71fb20869e208cfeb9cba5426cc8b2796ba267a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xassoccnt.sty) \
texlive-xassoccnt"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(l3keys2e.sty) \
tex(letltxmacro.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
