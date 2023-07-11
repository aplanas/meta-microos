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

PV = "2023.201.1.0svn18115"

RPM_NAME = "texlive-esk-2023.201.1.0svn18115-53.2.noarch.rpm"
RPM_HASH = "fb8567543962039333c5beb37eff4ed99971729975d3974395fe3b3648c6ac8d7c615bfa92aeb34368208da4ff8d56812d7038ae57ec267272fcd3f6d1f8e746"
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
