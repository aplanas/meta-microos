SUMMARY = "Typeset code with annotations"
DESCRIPTION = "The idea of this Package is to typeset illustrations of pieces \
of code with annotations on each single part of code (Code \
Anatomy). The origin of this idea are code illustrations from \
the book 'Computer Science: An Interdisciplinary Approach' from \
Robert Sedgewick and Kevin Wayne. The package depends on expl3, \
xparse, and TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4_betasvn65648"

RPM_NAME = "texlive-codeanatomy-2023.209.0.0.4_betasvn65648-54.1.noarch.rpm"
RPM_HASH = "69953a5221762d549494a366f00858d24d8df23d04527fc35316c572874d7e6ecad54fe7640f0d258ea4056779c2a5c04dde9335399c723a9cdca676bf939b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codeanatomy.sty \
texlive-codeanatomy"

RDEPENDS:${PN} += "/usr/bin/sh \
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
