SUMMARY = "Draw execution stacks"
DESCRIPTION = "This simple LaTeX package provides support for drawing \
execution stack (typically to illustrate assembly language \
notions). The code is written on top of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28582"

RPM_NAME = "texlive-drawstack-2023.201.svn28582-52.1.noarch.rpm"
RPM_HASH = "9f8caafdff1a8a075efa33e47dc8478e7d156f5eb70565cc1b6ab93045a51699502a8226f31f3749bcf69040b46c9a526eeba63d30d6b24a83436b99117959a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drawstack.sty \
texlive-drawstack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
