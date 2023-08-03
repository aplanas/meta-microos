SUMMARY = "Typeset (Italian high school) exercises"
DESCRIPTION = "This class provides various environments and commands to \
produce the typical exercises contained in a test. It is mainly \
intended for Italian high school teachers, as the style is \
probably more in line with Italian high school tests."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn56625"

RPM_NAME = "texlive-verifica-2023.209.1.3svn56625-54.1.noarch.rpm"
RPM_HASH = "a9779ebd1c4c5b167106ceadd8c325d81e7e4137e68b1aaf3ab2b193de5a166cf025bc97e092107c16b7d080c5c03c0d883eb1f48bb71dd55e66c6c1fff9c77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verifica.cls \
texlive-verifica"

RDEPENDS:${PN} += "/usr/bin/sh \
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
