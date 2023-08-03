SUMMARY = "Template for a simple thesis or dissertation (Ph.D. or master's degree) or technical report, in XeLaTeX"
DESCRIPTION = "Template for a simple thesis or dissertation (Ph.D. or master's \
degree) or technical report, in XeLaTeX. Simple template that \
can be further customized or extended, with numerous examples. \
Consistent style for figures, tables, mathematical theorems, \
definitions, lemmas, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn43058"

RPM_NAME = "texlive-simple-thesis-dissertation-2023.209.svn43058-54.1.noarch.rpm"
RPM_HASH = "f2e0518d7b85d104039cd0e08caf0cd617381865a9d2f105be796b8ca5037f4286a6ed375295c2fa3c3aef4a274e55a3c959e363b11b67d5f76a1a0dd1e9511e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplethesisdissertation.cls \
texlive-simple-thesis-dissertation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algpseudocode.sty \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-arydshln.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-cite.sty \
tex-color.sty \
tex-datetime2.sty \
tex-environ.sty \
tex-fontspec.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lipsum.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-report.cls \
tex-rotating.sty \
tex-setspace.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-underscore.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
