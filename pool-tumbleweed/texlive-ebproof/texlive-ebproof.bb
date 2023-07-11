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

RPM_NAME = "texlive-ebproof-2023.201.2.1.1svn57544-53.2.noarch.rpm"
RPM_HASH = "d4707c540fe3b0bf1d3d084591e40ab41ea70b632bf8552525177ad8b3fdf5421e6438d00e102142ac87864524222629989d3976abb6e9ab6a225d706b3376fc"
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
