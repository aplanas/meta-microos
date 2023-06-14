SUMMARY = "Typeset code with annotations"
DESCRIPTION = "The idea of this Package is to typeset illustrations of pieces \
of code with annotations on each single part of code (Code \
Anatomy). The origin of this idea are code illustrations from \
the book 'Computer Science: An Interdisciplinary Approach' from \
Robert Sedgewick and Kevin Wayne. The package depends on expl3, \
xparse, and TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4_betasvn65648"

RPM_NAME = "texlive-codeanatomy-2023.201.0.0.4_betasvn65648-53.1.noarch.rpm"
RPM_HASH = "e7836ffcf8d9e0fc8d1a6fdbadd644aa733dd357a497df6e3d9e8284a15eb6819b1f1f58cd2905ef3569db1ac67fecbc4b811e08446467b1929f3cd12acbd6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codeanatomy.sty \
texlive-codeanatomy"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
