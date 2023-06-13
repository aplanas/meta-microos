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

RPM_NAME = "texlive-esk-2023.201.1.0svn18115-53.1.noarch.rpm"
RPM_HASH = "63754a79d61f2c259748155147e0c6b5a024c7a7a08acc536557bb589162b6d77fc47adde491ad89e3337176a4c1456ca210d73a052cbf23d843fc4a4643f8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(esk.sty) \
texlive-esk"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvsetkeys.sty) \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
