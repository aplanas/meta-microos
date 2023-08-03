SUMMARY = "Package to encapsulate Sketch files in LaTeX sources"
DESCRIPTION = "The ESK package allows to encapsulate Sketch files in LaTeX \
sources. This is very useful for keeping illustrations in sync \
with the text. It also frees the user from inventing \
descriptive names for new files that fit into the confines of \
file system conventions. Sketch is a 3D scene description \
language by Eugene K. Ressler and can generate TikZ and \
PSTricks code. ESK behaves in a similar fashion to EMP (which \
encapsulates MetaPost files), and was in fact developed from \
it."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn18115"

RPM_NAME = "texlive-esk-2023.209.1.0svn18115-54.1.noarch.rpm"
RPM_HASH = "369e161b14be5d44cd755773a319d5d09b3cb294030fdc3bfbbc2101e4a9d3083a811654d740a229a09344fa0434eef61227e0ffa3836a1b9387a7e64e038c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esk.sty \
texlive-esk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvsetkeys.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
