SUMMARY = "Semantic math commands in LaTeX"
DESCRIPTION = "This LaTeX package provides both syntactic and semantic helpers \
to typeset mathematics in LaTeX. The syntactic layer eases \
typesetting of formulae in general, while the semantic layer \
provides commands like \\inner{x}{y} to unify typesetting of \
inner products. These not only unify typesetting of math \
formulae but also allow to easily adapt notation if a user \
prefers to. The semantic layer is split into topics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn63241"

RPM_NAME = "texlive-mathsemantics-2023.201.1.0.0svn63241-52.1.noarch.rpm"
RPM_HASH = "6adc4171090afb7822aee65d77cba72017edc58166cf7ddff3a3a780f1c7affb87e48b7cba08b69c6b359e49d4734db014c3268a959bc7e69072aa99722ab373"
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

RDEPENDS:${PN} += "/bin/sh \
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
