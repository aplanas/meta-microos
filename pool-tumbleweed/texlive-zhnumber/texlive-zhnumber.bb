SUMMARY = "Typeset Chinese representations of numbers"
DESCRIPTION = "The package provides commands to typeset Chinese \
representations of numbers. The main difference between this \
package and CJKnumb is that the commands provided are \
expandable in the 'proper' way."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn66115"

RPM_NAME = "texlive-zhnumber-2023.201.3.0svn66115-52.2.noarch.rpm"
RPM_HASH = "340a5dba86394e09d6bfb55b4bc3ac77d6e0027650b5704458f04cf9149dc1f49fd2913fcd73be71e8843b6c9b62614b49098fdb4341274f2e20fa6692994923"
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
