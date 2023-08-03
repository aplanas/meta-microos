SUMMARY = "Processing an environment's body"
DESCRIPTION = "The package offers tools for collecting and executing an \
environment's body."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29331"

RPM_NAME = "texlive-newenviron-2023.209.1.0svn29331-55.1.noarch.rpm"
RPM_HASH = "fadfb6fb1e636aaba00721a0a0480f3199e15965aa1a2045876a54c94ea576700325f84a0c847f90001f99931330934bcfc6ad44e55a5b2504f8efc3ea52431d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newenviron.sty \
texlive-newenviron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
