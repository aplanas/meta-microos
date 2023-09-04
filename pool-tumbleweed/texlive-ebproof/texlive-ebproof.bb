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

RPM_NAME = "texlive-ebproof-2023.209.2.1.1svn57544-54.2.noarch.rpm"
RPM_HASH = "229ad4dd3a8dfeb0175e7e6cf0abec7632a504420aca171da2397957e709f29596028396bfeccb91c7db03bc6c85378e3c60ed38a61861df112b28a369318353"
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
