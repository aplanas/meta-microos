SUMMARY = "Typesetting Live Sequence Charts"
DESCRIPTION = "This package is similar to the msc package in that it provides \
macros for typesetting a variant of sequence diagrams, in this \
case the Live Sequence Charts of Damm and Harel. The package \
supports the full LSC language of the original LSC paper, the \
Klose-extensions for formal verification and some of the \
Harel-extensions for the Play-In/Play-Out approach (cf. the \
manual)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-lsc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "a28cd6507e48167d57033ce64f0e0f776bb890a1bbb6801954bb842be3faaaa7e3f1db1a2345d94ceed937995afcfd27c628ff13579180367879f694f5a95017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lsc.sty \
texlive-lsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
