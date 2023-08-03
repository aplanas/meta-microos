SUMMARY = "Typeset mathematical double stroke symbols"
DESCRIPTION = "A font based on Computer Modern Roman useful for typesetting \
the mathematical symbols for the natural numbers (N), whole \
numbers (Z), rational numbers (Q), real numbers (R) and complex \
numbers (C); coverage includes all Roman capital letters, '1', \
'h' and 'k'. The font is available both as Metafont source and \
in Adobe Type 1 format, and LaTeX macros for its use are \
provided. The fonts appear in the blackboard bold sampler."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.111svn15878"

RPM_NAME = "texlive-doublestroke-2023.209.1.111svn15878-53.1.noarch.rpm"
RPM_HASH = "ec6faf32c09489bee923d94a6d8cb5bd0bcede014d24ceb60c9f4c9d0a878e877d1e027d31f0445f38e87953f2e330360a201e4cdc1190bd8438cacdeba80e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Udsrom.fd \
tex-Udsss.fd \
tex-dsfont.sty \
tex-dsrom10.tfm \
tex-dsrom12.tfm \
tex-dsrom8.tfm \
tex-dsss10.tfm \
tex-dsss12.tfm \
tex-dsss8.tfm \
tex-dstroke.map \
texlive-doublestroke"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-doublestroke-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
