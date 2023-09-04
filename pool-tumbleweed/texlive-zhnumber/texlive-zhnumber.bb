SUMMARY = "Typeset Chinese representations of numbers"
DESCRIPTION = "The package provides commands to typeset Chinese \
representations of numbers. The main difference between this \
package and CJKnumb is that the commands provided are \
expandable in the 'proper' way."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn66115"

RPM_NAME = "texlive-zhnumber-2023.209.3.0svn66115-53.2.noarch.rpm"
RPM_HASH = "e09dd34fbd411d954475b4021cce4ef809e5e65847e07fea43528dee377e9cec29d043524abe27db7669b20e2945c0ee8caa8ba0d3806ce7330da0f1e9177c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhnumber-big5.cfg \
tex-zhnumber-gbk.cfg \
tex-zhnumber-utf8.cfg \
tex-zhnumber.sty \
texlive-zhnumber"

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
