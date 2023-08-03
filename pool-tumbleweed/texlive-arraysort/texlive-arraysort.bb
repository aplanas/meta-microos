SUMMARY = "Sort arrays (or portions of them)"
DESCRIPTION = "The package provides a mechanism for sorting arrays (or \
portions of them); the arrays should have been created using \
the arrayjobx package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn31576"

RPM_NAME = "texlive-arraysort-2023.209.1.0svn31576-54.1.noarch.rpm"
RPM_HASH = "e257fde19a04bf1daa568d6aa995d7d062a789309b829bf16db6793ceccbc182eb716431c38b7424b333c82d61c7019001300400b298fb8a41d741ce718f7530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arraysort.sty \
texlive-arraysort"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjobx.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-lcg.sty \
tex-macroswap.sty \
tex-pdftexcmds.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
