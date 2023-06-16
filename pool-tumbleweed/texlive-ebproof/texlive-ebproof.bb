SUMMARY = "Formal proofs in the style of sequent calculus"
DESCRIPTION = "This package provides commands to typeset proof trees in the \
style of sequent calculus and related systems. The commands \
allow for writing inferences with any number of premises and \
alignment of successive formulas on an arbitrary point. Various \
options allow complete control over spacing, styles of \
inference rules, placement of labels, etc. The package requires \
expl3 and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn57544"

RPM_NAME = "texlive-ebproof-2023.201.2.1.1svn57544-53.1.noarch.rpm"
RPM_HASH = "3468fc4619f2eff2d1772d895f01c355b7bf713b711569ff66aa76d3980b9e1a28a294ef5d4dd809e3a3ea1da207578208bbec539d3dff8391c311ea828f0274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebproof.sty \
texlive-ebproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
