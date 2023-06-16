SUMMARY = "LaTeX3 programming conventions"
DESCRIPTION = "The l3kernel bundle provides an implementation of the LaTeX3 \
programmers' interface, as a set of packages that run under \
LaTeX2e. The interface provides the foundation on which the \
LaTeX3 kernel and other future code are built: it is an API for \
TeX programmers. The packages are set up so that the LaTeX3 \
conventions can be used with regular LaTeX2e packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66094"

RPM_NAME = "texlive-l3kernel-2023.201.svn66094-55.1.noarch.rpm"
RPM_HASH = "b7fb3afdc3527dadbd93583bc2ff5d86c75f4cd8b5dab7b1d8c99ad1b3abb476cfbf3f9a7cbb59e392e31da0c4b5577f6545b006756421f5430e164e690774a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expl3-code.tex \
tex-expl3-generic.tex \
tex-expl3.sty \
tex-l3debug.def \
tex-l3doc.cls \
tex-l3docstrip.tex \
tex-l3str-enc-iso88591.def \
tex-l3str-enc-iso885910.def \
tex-l3str-enc-iso885911.def \
tex-l3str-enc-iso885913.def \
tex-l3str-enc-iso885914.def \
tex-l3str-enc-iso885915.def \
tex-l3str-enc-iso885916.def \
tex-l3str-enc-iso88592.def \
tex-l3str-enc-iso88593.def \
tex-l3str-enc-iso88594.def \
tex-l3str-enc-iso88595.def \
tex-l3str-enc-iso88596.def \
tex-l3str-enc-iso88597.def \
tex-l3str-enc-iso88598.def \
tex-l3str-enc-iso88599.def \
texlive-l3kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-doc.sty \
tex-fontenc.sty \
tex-hypdoc.sty \
tex-lmodern.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
