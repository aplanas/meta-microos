SUMMARY = "LaTeX environments for typesetting algorithms"
DESCRIPTION = "Defines two environments for typesetting algorithms in LaTeX2e. \
The algtab environment is used to typeset an algorithm with \
automatically numbered lines. The algorithm environment can be \
used to encapsulate the algtab environment algorithm in a \
floating body together with a header, a caption, etc. \
\\listofalgorithms is defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-alg-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "de39a52e303f428593f21ff4094df156bc999af49608db7fba1819d4df7c6adc337db5f0eb22d88558a0bc89df6505d6b1cd9bdb597d06f354cce2058c623d13"
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
