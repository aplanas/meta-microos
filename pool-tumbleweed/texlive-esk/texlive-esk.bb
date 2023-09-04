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

RPM_NAME = "texlive-esk-2023.209.1.0svn18115-54.2.noarch.rpm"
RPM_HASH = "8220348519764af8b843b0d583f3e55e7f13e0006f50df1036b52136fdecdc38d3ed004635b688d2ff6fc58213dda5fd4c642f329e532a982f129e971d216b45"
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
