SUMMARY = "LaTeX environments for typesetting algorithms"
DESCRIPTION = "Defines two environments for typesetting algorithms in LaTeX2e. \
The algtab environment is used to typeset an algorithm with \
automatically numbered lines. The algorithm environment can be \
used to encapsulate the algtab environment algorithm in a \
floating body together with a header, a caption, etc. \
\\listofalgorithms is defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-alg-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "353282af06f171a40cc32d00d55d59305225056223d186ba45fc2e2f57b08b4e8d29650a92681eb6d0c79a0c6b3d4ab2d0842f323eee86c3c03c00be3b2836c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alg.sty \
texlive-alg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
