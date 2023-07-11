SUMMARY = "Semantic math commands in LaTeX"
DESCRIPTION = "This LaTeX package provides both syntactic and semantic helpers \
to typeset mathematics in LaTeX. The syntactic layer eases \
typesetting of formulae in general, while the semantic layer \
provides commands like \\inner{x}{y} to unify typesetting of \
inner products. These not only unify typesetting of math \
formulae but also allow to easily adapt notation if a user \
prefers to. The semantic layer is split into topics."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.0svn63241"

RPM_NAME = "texlive-mathsemantics-2023.208.1.0.0svn63241-53.1.noarch.rpm"
RPM_HASH = "3965835f566b226a5e3a39d4616bc855fb580d4ff3b6588c552a305e05ca4e929d0b347b2a830e0d34bd1daa18c70b5f30031e428a05721fed9b5bda7183d2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathsemantics-abbreviations.sty \
tex-mathsemantics-commons.sty \
tex-mathsemantics-manifolds.sty \
tex-mathsemantics-names.sty \
tex-mathsemantics-optimization.sty \
tex-mathsemantics-semantic.sty \
tex-mathsemantics-syntax.sty \
tex-mathsemantics.sty \
texlive-mathsemantics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-mathtools.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
