SUMMARY = "Typeset Austrian SRDP in mathematics"
DESCRIPTION = "This package provides basic commands for the defined formats of \
the Austrian sRDP (Standardisierte Reife- und Diplomprufung) in \
mathematics. Furthermore, it includes ways to implement answers \
in the tex file which can optionally be displayed in the pdf \
file, and it offers a way to vary the answers in order to \
create different groups (e. g. for tests) easily."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11.0svn65293"

RPM_NAME = "texlive-srdp-mathematik-2023.209.1.11.0svn65293-58.1.noarch.rpm"
RPM_HASH = "b6438532b8e7c660528595dffdf35bb94f60186e1dd3e26f999b00a27581c6335c7ae64c83f079b6ba9b65cedb6f759c5b7a2e35e9ccd1d1c19fe3a43a01c5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-srdp-mathematik.sty \
tex-srdp-tables.sty \
texlive-srdp-mathematik"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-cancel.sty \
tex-chngcntr.sty \
tex-color.sty \
tex-colortbl.sty \
tex-delarray.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-esvect.sty \
tex-eurosym.sty \
tex-float.sty \
tex-forloop.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-ifthen.sty \
tex-linegoal.sty \
tex-longtable.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-pgf-pie.sty \
tex-pgfkeys.sty \
tex-pgfplots.sty \
tex-pgfplotstable.sty \
tex-phaistos.sty \
tex-pst-coil.sty \
tex-pstricks-add.sty \
tex-setspace.sty \
tex-spreadtab.sty \
tex-substitutefont.sty \
tex-tabularx.sty \
tex-trimspaces.sty \
tex-varwidth.sty \
tex-wasysym.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-ziffer.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
