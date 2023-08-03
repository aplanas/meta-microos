SUMMARY = "Macros useful in preparing teaching material"
DESCRIPTION = "Several groups of macros cover different branches of \
mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn55859"

RPM_NAME = "texlive-pas-cours-2023.209.1.9svn55859-52.1.noarch.rpm"
RPM_HASH = "f827b4d67a7259239181ec3aed0c202b02e694ce51a17685b853cff428f1d4ef82052725e6af87c6f2669b886bf6130e0e4d20116db1ad03aabc5f05f63b5dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macro-calculs.tex \
tex-macro-patrons.tex \
tex-macro-solides.tex \
tex-macro-styles.tex \
tex-pas-cours.sty \
texlive-pas-cours"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-auto-pst-pdf.sty \
tex-enumitem.sty \
tex-fancyvrb.sty \
tex-ifplatform.sty \
tex-numprint.sty \
tex-pst-plot.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
