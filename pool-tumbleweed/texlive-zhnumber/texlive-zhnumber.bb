SUMMARY = "Typeset Chinese representations of numbers"
DESCRIPTION = "The package provides commands to typeset Chinese \
representations of numbers. The main difference between this \
package and CJKnumb is that the commands provided are \
expandable in the 'proper' way."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn66115"

RPM_NAME = "texlive-zhnumber-2023.209.3.0svn66115-53.1.noarch.rpm"
RPM_HASH = "2e68dddffb1d83f865f049dd52b6ca35be05b991e07dfaf64358e11b40de816449ef76f82b4b3752985ea3eec57a0e13383ff7fc9b01ba4fe6296fa42fa89583"
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
