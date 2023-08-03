SUMMARY = "Formal proofs in the style of sequent calculus"
DESCRIPTION = "This package provides commands to typeset proof trees in the \
style of sequent calculus and related systems. The commands \
allow for writing inferences with any number of premises and \
alignment of successive formulas on an arbitrary point. Various \
options allow complete control over spacing, styles of \
inference rules, placement of labels, etc. The package requires \
expl3 and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn57544"

RPM_NAME = "texlive-ebproof-2023.209.2.1.1svn57544-54.1.noarch.rpm"
RPM_HASH = "dc4f90e92cb6609d6409326a1407801f7b1cd5375fda0e7ca16ee732fea0cf33b5994f1e9ba18569e8849ef9df06bde0c5d4e66cf51635a0564b88670d1f3d6d"
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
