SUMMARY = "Thesis template for the Nanjing University of Science and Technology"
DESCRIPTION = "This is a thesis template for the Nanjing University of Science \
and Technology>."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.0.1svn62451"

RPM_NAME = "texlive-njustthesis-2023.209.0.0.0.1svn62451-55.1.noarch.rpm"
RPM_HASH = "ef44389972f35a707664a3e31f7faa30147e508411480b9255fe980c639b7a715e56407c8ecfb248aebd7bd2be0efe375bf24fbea7870542cb29ff106e0d2f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njustthesis.cls \
texlive-njustthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-boxedminipage.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-exercise.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-indentfirst.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-multicol.sty \
tex-newtxmath.sty \
tex-pifont.sty \
tex-setspace.sty \
tex-tabu.sty \
tex-titletoc.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
