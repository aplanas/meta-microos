SUMMARY = "Graphs and Automata Simplified in TeX"
DESCRIPTION = "GasTeX is a set of LaTeX macros which enable the user to draw \
graphs, automata, nets, diagrams, etc., very easily, in the \
LaTeX picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn58505"

RPM_NAME = "texlive-gastex-2023.209.3.0svn58505-53.1.noarch.rpm"
RPM_HASH = "a4a766a171e1e9a5a4f0df39161a0746d6f39ab43ffde40a8f5f457694aacdd6255b25852dcfc49d890a6ceedcfb9e7cfc07bb2ed4bcc34069a38a7fec6ebe87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gastex.sty \
texlive-gastex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auto-pst-pdf.sty \
tex-calc.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-pst-pdf.sty \
tex-trig.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
