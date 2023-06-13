SUMMARY = "Typesetting Live Sequence Charts"
DESCRIPTION = "This package is similar to the msc package in that it provides \
macros for typesetting a variant of sequence diagrams, in this \
case the Live Sequence Charts of Damm and Harel. The package \
supports the full LSC language of the original LSC paper, the \
Klose-extensions for formal verification and some of the \
Harel-extensions for the Play-In/Play-Out approach (cf. the \
manual)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-lsc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "bff176cc7b05b6250002c9ac3d70f906d3513376e774f5fd2a81aab66f349d5776ea6e163f92a075adc2a0194d77a142a31b8ac27c5637109f2b178b67d4c828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lsc.sty) \
texlive-lsc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(pst-node.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
