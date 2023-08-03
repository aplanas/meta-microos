SUMMARY = "LaTeX3 programming conventions"
DESCRIPTION = "The l3kernel bundle provides an implementation of the LaTeX3 \
programmers' interface, as a set of packages that run under \
LaTeX2e. The interface provides the foundation on which the \
LaTeX3 kernel and other future code are built: it is an API for \
TeX programmers. The packages are set up so that the LaTeX3 \
conventions can be used with regular LaTeX2e packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66094"

RPM_NAME = "texlive-l3kernel-2023.209.svn66094-56.1.noarch.rpm"
RPM_HASH = "f44ac475b55b2574939a070ba0852c3537b98f13b6e52f71008ce08e74cc6c84621d525f174d7a8222fa63938deb17707bd0ea69e3904adbe2e51b19e260abd0"
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
