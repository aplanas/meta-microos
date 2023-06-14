SUMMARY = "Typeset (Italian high school) exercises"
DESCRIPTION = "This class provides various environments and commands to \
produce the typical exercises contained in a test. It is mainly \
intended for Italian high school teachers, as the style is \
probably more in line with Italian high school tests."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn56625"

RPM_NAME = "texlive-verifica-2023.201.1.3svn56625-53.1.noarch.rpm"
RPM_HASH = "601fae0a81b29ce366dded4899558d44691568e49fe9d75450f6d458aa826de65d277cc0c19e51f4986c8859c39f9f1c82e9f4d3745b7eeefe1331ec8655172a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verifica.cls \
texlive-verifica"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-article.cls \
tex-bm.sty \
tex-cmbright.sty \
tex-enumitem.sty \
tex-eurosym.sty \
tex-extarticle.cls \
tex-gensymb.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-lineno.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-multido.sty \
tex-nccmath.sty \
tex-newunicodechar.sty \
tex-setspace.sty \
tex-tabto.sty \
tex-tabularx.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
